package Animal;

abstract public class Animal {
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

class Lesson {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Aba");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();

        Speakable s = new Punguin("Lifon");
        s.speak();

        Animal a = new Lev("Musc");
        System.out.println(a.name);
        a.eat();
        a.sleep();

        Mammal mm = new Lev("Vist");
        System.out.println(mm.name);
        mm.speak();
        mm.run();
        mm.eat();
        mm.sleep();
    }
}