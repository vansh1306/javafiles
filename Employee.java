class Employee {     private String name;     private int empid;     private double salary;     public Employee() {         this.name = "";         this.empid = 0;         this.salary = 0.0; 
    } 
    public Employee(String name, int empid, double salary) {         this.name = name;         this.empid = empid; 
this.salary = salary; 
    } 
    public String getName() {         return name; 
    } 
    public double getSalary() { 
        return salary; 
    } 
    public void increaseSalary(double percentage) {         salary += (salary * percentage / 100.0); 
    } 
} 
class Manager extends Employee {     private String department; 
    public Manager(String name, int empid, double salary, String department) { 
        super(name, empid, salary);         this.department = department; 
    } 
    public String getDepartment() { 
return department; 
    } 
    public void changeDepartment(String newDepartment) {         department = newDepartment; 
    } 
    public void increaseSalary(double percentage) {         super.increaseSalary(percentage + 10); 
    } 
} 
 
class EmployeeTest { 
    public static void main(String[] args) { 
        Employee employee = new Employee("Rajwardhan Singh bhadoria", 101, 50000.0); 
        Manager manager = new Manager("Rajesh", 201, 70000.0, "HR"); 
        System.out.println("Employee Name: " + employee.getName()); 
        System.out.println("Employee Salary: $" + employee.getSalary()); 
        System.out.println("\nManager Name: " + manager.getName()); 
        System.out.println("Manager Salary: $" + manager.getSalary()); 
        System.out.println("Manager Department: " + manager.getDepartment()); employee.increaseSalary(5);         manager.increaseSalary(8); 
        System.out.println("\nUpdated Employee Salary: $" + employee.getSalary()); 
        System.out.println("Updated Manager Salary: $" + manager.getSalary());         manager.changeDepartment("Finance"); 
        System.out.println("\nManager's New Department: " + manager.getDepartment()); 
    } 
} 
