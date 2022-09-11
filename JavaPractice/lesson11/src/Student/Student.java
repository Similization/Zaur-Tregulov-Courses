package Student;

public class Student {
    public String name;
    public int course;
    double grade;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void getInfo() {
        System.out.println(
                "Student info: " +
                        "\nName: " + name +
                        "\nCourse: " + course +
                        "\nGrade: " + grade +
                        "\n~~~~~~~~~~~~~~~~~~~~~~"
        );
    }
}
