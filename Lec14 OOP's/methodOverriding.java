public class methodOverriding {

    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
    }
}

class Animal {

    void eat() {
        System.out.println("Eats Anything");
    }
}

class Dear extends Animal {

    void eat() {
        System.out.println("Eats grass");
    }
}
