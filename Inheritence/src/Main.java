//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.firstName = "John";
        customer.lastName = "Doe";
        customer.age = 12;
        customer.email = "aas@asc.com";

        employee.firstName = "John";
        employee.lastName = "Doe";
        employee.age = 12;
        employee.salary = 5000;

        CustomerManager  customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.Add();
        employeeManager.GetBestEmployee();
        employeeManager.Get();
    }
}