package p4;

import p1.A;
import static p1.p2.B.a;
import p1.p2.B;
import p1.p2.p3.C;
import p4.p5.E;

public class D {
    A a1 = new A();
    C c1 = new C();
    E e1 = new E();

    public static void main(String[] args) {
        System.out.println(a);
        B.doubleB();
    }
}
