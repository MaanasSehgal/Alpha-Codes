package hwlec14;

// @Override ka use tab hota hai jab hum kisi superclass ke method ko subclass mein override karte hain.

class Gadi {

    void chalao() {
        System.out.println("Gadi chala raha hai");
    }
}

class Car extends Gadi {

    @Override
    void chalao() {
        System.out.println("Car chala raha hai");
    }
}

// `final` ka use class, method, ya variable ko fix ya change nahi hone deta.

final class FixedClass {

    // Yeh class kisi aur class ka subclass nahi ban sakta.

    final void fixedMethod() {
        // Yeh method kisi subclass mein override nahi ho sakta.
    }

    final int fixedNumber = 42;
    // Yeh variable sirf ek baar initialize hone ke baad change nahi ho sakta.
}
