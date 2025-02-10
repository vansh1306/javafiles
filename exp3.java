import java.util.Scanner;
public class exp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        String[] studentNames = new String[numStudents];
        int[][] studentMarks = new int[numStudents][numSubjects];
        int[] subjectCredits = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the credit score for subject " + (i + 1) + ": ");
            subjectCredits[i] = scanner.nextInt();
        }
        scanner.nextLine(); 
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + "'s name: ");
            studentNames[i] = scanner.nextLine();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + " for " + studentNames[i] + ": ");
                studentMarks[i][j] = scanner.nextInt();
            }
            if (i < numStudents - 1) {
                scanner.nextLine();  
            }
        }
        System.out.println("Grades for students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent: " + studentNames[i]);
            int totalCredits = 0;
            double totalGradePoints = 0.0;
            for (int j = 0; j < numSubjects; j++) {
                int marks = studentMarks[i][j];
                int credits = subjectCredits[j];
                double subjectGradePoints = calculateGradePoints(marks);
                totalGradePoints += subjectGradePoints * credits;
                totalCredits += credits;
                System.out.println("Subject " + (j + 1) + ": Marks = " + marks + ", Grade = " + getGrade(marks));
            }
            double overallGrade = totalGradePoints / totalCredits;
            System.out.println("Overall Grade: " + overallGrade);
        }
        scanner.close();
    }
    public static String getGrade(int marks) {
        if (marks < 35) return "F";
        else if (marks < 45) return "C";
        else if (marks < 55) return "B";
        else if (marks < 65) return "B+";
        else if (marks < 75) return "A";
        else if (marks < 85) return "A+";
        else if (marks <= 100) return "O";
        else return "Invalid Data";
    }
    public static double calculateGradePoints(int marks) {
        if (marks < 35) return 0;
        else if (marks < 45) return 5;
        else if (marks < 55) return 6;
        else if (marks < 65) return 7;
        else if (marks < 75) return 8;
        else if (marks < 85) return 9;
        else if (marks <= 100) return 10;
        else return 0;
    }
}
