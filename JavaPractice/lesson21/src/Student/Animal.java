package Student;

public class Animal {
    public int eyes;
    Animal() {
        System.out.println("I am animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;
    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }
    public void run() {
        System.out.println("Pet runs");
    }
    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am a dog and my name is: " + name);
    }
    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I am a cat and my name is: " + name);
    }
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Cat c = new Cat("Rich");
        Dog d = new Dog("Butch");

        System.out.println(d.paw);
        c.sleep();
    }
}
