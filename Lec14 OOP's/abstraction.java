public class abstraction {

    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("Horses: ");
        h.eat();
        h.walk();

        System.out.println();

        Chicken c = new Chicken();
        System.out.println("Chicken: ");
        c.eat();
        c.walk();
    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void changeColor() {
        color="dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color="yellow";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
