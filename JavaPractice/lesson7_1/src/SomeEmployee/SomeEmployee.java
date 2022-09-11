package SomeEmployee;

import Employee.Employee;

public class SomeEmployee {

    public static final int cons = 0;

    public static void main(String[] args) {
        Employee emp = new Employee("L");
        emp.surname = "S";
        emp.showId();
        emp.showSalary();
        emp.showSurname();

        System.out.println(cons);
    }
}
