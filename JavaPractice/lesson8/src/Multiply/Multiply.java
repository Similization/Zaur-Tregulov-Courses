package Multiply;

public class Multiply {
    static int multiplyThree(int a, int b, int c) {
        return a * b * c;
    }
    static void divide(int a, int b) {
        System.out.print("celoe: " + a / b);
        System.out.println(", ostatok: " + (a - (a / b) * b));
    }

    public static void main(String[] args) {
        System.out.println(multiplyThree(2, 3, 4));
        System.out.println(multiplyThree(3, 4, 5));
        divide(17, 5);
        divide(1, 2);

        Multiply m = null;
        System.out.println(m);
    }
}
