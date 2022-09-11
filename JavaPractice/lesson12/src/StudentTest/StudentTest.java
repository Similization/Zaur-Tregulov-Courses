package StudentTest;

import Student.Student;

import java.util.Objects;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 4);
        Student st2 = new Student("Anya", 4);

        st1.getInfo();
        st2.getInfo();

        if (st1.course == st2.course && Objects.equals(st1.name, st2.name)) {
            System.out.println("This is probably the same student");
        } else {
            System.out.println("These student are probably different");
        }

        if (st1.course == st2.course) {
            if (st1.name.equals(st2.name)) {
                System.out.println("This is the same student");
            }
            else {
                System.out.println("These students have different names");
            }
        } else {
            System.out.println("These students have different courses");
        }
    }
}
