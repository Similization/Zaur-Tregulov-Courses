package lesson25;

abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {
    String name;
    Fish(String name) {
        super(name);
        this.name = name;
    }
    void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spyat ribi");
    }
    abstract void swim();
}

class Mechenosec extends Fish {
    String name;
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }
    @Override
    void swim() {
        System.out.println("Mechenosec - krasivaya riba, kotoraya bistro plavaet");
    }
    @Override
    void eat() {
        System.out.println("Mechenosec ne hishnaya riba, i ona est obichiniy ribiy korm");
    }
}

abstract class Bird extends Animal implements Speakable {
    String name;
    Bird(String name) {
        super(name);
        this.name = name;
    }
    abstract void fly();
    @Override
    public void speak() {
        System.out.println("" + name + " sings");
    }
}

class Punguin extends Bird {
    String name;
    Punguin(String name) {
        super(name);
        this.name = name;
    }
    @Override
    void eat() {
        System.out.println("Pinguin lubit est ribu!");
    }
    @Override
    void sleep() {
        System.out.println("Pinguini spyat drug k drugu");
    }
    @Override
    void fly() {
        System.out.println("Pinguini ne umeut letat!");
    }
}

abstract class Mammal extends Animal implements Speakable {
    String name;
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}

class Lev extends Mammal {
    String name;
    Lev(String name) {
        super(name);
        this.name = name;
    }
    @Override
    void eat() {
        System.out.println("Lev, kak luboi hishnik lubit myaso!");
    }
    @Override
    void sleep() {
        System.out.println("Bolsuyu chast dnya lev spit");
    }
    @Override
    void run() {
        System.out.println("Lev - eto samaya bistraya koshka");
    }
}

interface Speakable {
    default void speak() {System.out.println("Somebody speaks");}
}

public class lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("mechenosec1");
        Animal a2 = new Punguin("pinguin1");
        Animal a3 = new Lev("lev1");
        Mechenosec m1 = new Mechenosec("m1");
        Punguin p1 = new Punguin("p1");
        Lev l1 = new Lev("l1");
        Speakable s1 = new Punguin("p2");
        Speakable s2 = new Lev("l2");

        Speakable []speakables = {p1, l1, s1, s2};
        Animal []animals = {a1, a2, a3, m1, p1, l1};

        for (Speakable s: speakables) {
            if (s instanceof Mechenosec) {
                System.out.println(((Mechenosec)s).name);
                ((Mechenosec)s).eat();
                ((Mechenosec)s).swim();
                ((Mechenosec)s).sleep();
            } else if (s instanceof Punguin) {
                System.out.println(((Punguin)s).name);
                ((Punguin)s).eat();
                ((Punguin)s).sleep();
                ((Punguin)s).fly();
                s.speak();
            } else if (s instanceof Lev) {
                System.out.println(((Lev)s).name);
                ((Lev)s).eat();
                ((Lev)s).sleep();
                ((Lev)s).run();
                s.speak();
            }
        }

        for (Animal s: animals) {
            if (s instanceof Mechenosec) {
                System.out.println(((Mechenosec)s).name);
                s.eat();
                ((Mechenosec)s).swim();
                s.sleep();
            } else if (s instanceof Punguin) {
                System.out.println(((Punguin)s).name);
                s.eat();
                s.sleep();
                ((Punguin)s).fly();
            } else if (s instanceof Lev) {
                System.out.println(((Lev)s).name);
                s.eat();
                s.sleep();
                ((Lev)s).run();
            }
        }
    }
}
