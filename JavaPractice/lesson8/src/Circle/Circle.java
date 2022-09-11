package Circle;

public class Circle {
    static final double PI = 3.14;

    static void showPerimeter(final double radius) {
        System.out.println("Perimeter: " + 2 * PI * radius);
    }
    void showSquare(final double radius) {
        System.out.println("Square: " + PI * radius * radius);
    }
    void showCircleInfo(final double radius) {
        System.out.println("Radius: " + radius);
        showPerimeter(radius);
        showSquare(radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.showSquare(4);
        Circle.showPerimeter(2);
        c1.showCircleInfo(25);
    }
}
