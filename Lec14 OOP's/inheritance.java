public class inheritance {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

class Mammals extends Animal {

    int legs;
}

class Dog extends Mammals {

    String breed;
}
// //Derived Class
// class Fish extends Animal {
//     int fins;
//     void swim() {
//         System.out.println("Swimming in water");
//     }
// }
