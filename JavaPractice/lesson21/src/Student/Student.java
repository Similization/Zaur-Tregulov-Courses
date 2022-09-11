package Student;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    public void setName(StringBuilder sb) {
        name = new StringBuilder(sb);
    }
    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        }
    }
    public int getCourse() {
        return course;
    }

    public void setGrade(double grade) {
        if (grade > 0 && grade < 11) {
            this.grade = grade;
        }
    }
    public double getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Ivan"));
        s.setCourse(2);
        s.setGrade(4.5);

        s.showInfo();
    }
}