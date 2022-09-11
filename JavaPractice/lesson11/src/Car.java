public class Car {
    String color;
    String engine;
    int doorsCount;

    void printInfo() {
        System.out.println("Color: " + color +
                "\nEngine: " + engine +
                "\nDoor count: " + doorsCount);
    }

    Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorCount;
    }
}

class CarTest {
    static void changeCarDoorsCount(Car car, final int newCount) {
        car.doorsCount = newCount;
    }
    static void changeColor(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }
    public static void main(String[] args) {
        Car c1 = new Car("red", "v4", 4);
        Car c2 = new Car("black", "v8", 6);
        changeCarDoorsCount(c1, 3);
        changeColor(c1, c2);
        c2.printInfo();
        c1.printInfo();
    }
}
