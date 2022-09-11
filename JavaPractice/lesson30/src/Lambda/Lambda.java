package Lambda;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Lambda {

}

class Employee {
    String name;
    String department;
    double salary;
    Employee(String n, String d, double s) {
        name = n;
        department = d;
        salary = s;
    }
}

class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println("Employee info: ");
        System.out.println("Name: " + e.name);
        System.out.println("Department: " + e.department);
        System.out.println("Salary: " + e.salary);
        System.out.println();
    }

    void filtracyaRabotnikov(Predicate<Employee> e, ArrayList<Employee> arr) {
        for (Employee emp: arr) {
            if (e.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("Anton", "d11", 320.50));
        arr.add(new Employee("Masha", "d12", 270.35));
        arr.add(new Employee("Aavel", "d11", 44.675));
        arr.add(new Employee("Lucya", "d13", 200));
        arr.add(new Employee("d11", "d12", 400.90));
        arr.add(new Employee("Lucya", "d13", 222.25));
        arr.add(new Employee("d11", "d11", 100.005));

        TestEmployee te = new TestEmployee();
        te.filtracyaRabotnikov(emp -> Objects.equals(emp.department, "d11") && emp.salary > 200, arr);
        te.filtracyaRabotnikov(emp -> emp.name.startsWith("A") && emp.salary < 300, arr);
        te.filtracyaRabotnikov(emp -> Objects.equals(emp.name, emp.department), arr);
    }
}
