package Employee;

public class Job {
    public static void main(String[] args) {
        Employee emp = new Employee("S", 12);
        emp.id = 10;
        emp.showId();
        emp.showSalary();
        emp.showSurname();
    }
}
