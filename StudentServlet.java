import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("insert".equals(action)) {
            insertStudent(request, response);
        } else if ("update".equals(action)) {
            updateStudent(request, response);
        } else if ("retrieve".equals(action)) {
            retrieveStudents(response);
        }
    }

    private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        String studentName = request.getParameter("studentName");
        int studentAge = Integer.parseInt(request.getParameter("studentAge"));
        String studentGrade = request.getParameter("studentGrade");

        try {
            Connection connection = getDbConnection();
            String insertQuery = "INSERT INTO student_details (student_id, student_name, student_age, student_grade) VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setInt(1, studentId);
                preparedStatement.setString(2, studentName);
                preparedStatement.setInt(3, studentAge);
                preparedStatement.setString(4, studentGrade);

                preparedStatement.executeUpdate();
            }
            connection.close();
            response.getWriter().println("Student record inserted successfully.");
        } catch (Exception e) {
            response.getWriter().println("Error inserting student record: " + e.getMessage());
        }
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        String studentGrade = request.getParameter("studentGrade");

        try {
            Connection connection = getDbConnection();
            String updateQuery = "UPDATE student_details SET student_grade = ? WHERE student_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                preparedStatement.setString(1, studentGrade);
                preparedStatement.setInt(2, studentId);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    response.getWriter().println("Student record updated successfully.");
                } else {
                    response.getWriter().println("No student record found with ID: " + studentId);
                }
            }
            connection.close();
        } catch (Exception e) {
            response.getWriter().println("Error updating student record: " + e.getMessage());
        }
    }

    private void retrieveStudents(HttpServletResponse response) throws IOException {
        try {
            Connection connection = getDbConnection();
            String retrieveQuery = "SELECT * FROM student_details";
            try (PreparedStatement preparedStatement = connection.prepareStatement(retrieveQuery);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                PrintWriter out = response.getWriter();
                out.println("<html><body><h2>Student Records</h2>");
                out.println("<table border=\"1\"><tr><th>ID</th><th>Name</th><th>Age</th><th>Grade</th></tr>");

                while (resultSet.next()) {
                    out.println("<tr>");
                    out.println("<td>" + resultSet.getInt("student_id") + "</td>");
                    out.println("<td>" + resultSet.getString("student_name") + "</td>");
                    out.println("<td>" + resultSet.getInt("student_age") + "</td>");
                    out.println("<td>" + resultSet.getString("student_grade") + "</td>");
                    out.println("</tr>");
                }

                out.println("</table></body></html>");
            }
            connection.close();
        } catch (Exception e) {
            response.getWriter().println("Error retrieving student records: " + e.getMessage());
        }
    }

    private Connection getDbConnection() throws Exception {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String dbUser = "your_username";
        String dbPassword = "your_password";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
    }
}
