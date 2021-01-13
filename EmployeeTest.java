import java.io.*;
class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1=new Employee("Vikash Kumar");
        Employee employee2=new Employee("Akash Kumar");
        Employee employee=new Employee("Nishu");
        employee1.empAge(17);
        employee1.empDesignation("Bhojpuri singer");
        employee1.empSalary(1000);
        employee2.empSalary(30000000);
        employee2.empDesignation("Software engineer");
        employee2.empAge(20);
        employee.empAge(19);
        employee.empSalary(05);
        employee.empDesignation("mehendi Design");
        employee.prinEmp();
        employee1.prinEmp();
        employee2.prinEmp();
    }
}

