public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement(10);

        Employee employee1 = new Employee(1, "John Doe", "Software Engineer", 50000.0);
        Employee employee2 = new Employee(2, "Jane Smith", "Marketing Manager", 60000.0);
        Employee employee3 = new Employee(3, "Bob Johnson", "Sales Representative", 40000.0);

        employeeManagement.addEmployee(employee1);
        employeeManagement.addEmployee(employee2);
        employeeManagement.addEmployee(employee3);

        System.out.println("Employees:");
        employeeManagement.traverseEmployees();

        Employee searchedEmployee = employeeManagement.searchEmployee(2);
        if (searchedEmployee != null) {
            System.out.println("Found employee: " + searchedEmployee.name);
        } else {
            System.out.println("Employee not found");
        }
        employeeManagement.deleteEmployee(1);

        System.out.println("Employees after deletion:");
        employeeManagement.traverseEmployees();
    }
}


