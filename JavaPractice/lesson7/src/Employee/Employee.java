package Employee;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public Employee(String surname) {
        this(0.0, surname, 0);
    }

    Employee(String surname, int id) {
        this(0.0, surname, id);
    }

    private Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public void showSalary() {
        System.out.println(salary);
    }
    public void showSurname() {
        System.out.println(surname);
    }
    public void showId() {
        System.out.println(id);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Chekhov", 5);
        emp1.showSalary();
        emp1.showSurname();
    }
}
