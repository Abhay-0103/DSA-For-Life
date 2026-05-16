package Abstract;

abstract class Bird {
    abstract void fly();

    abstract void eat();
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow Flying!");
    }

    @Override
    void eat() {
        System.out.println("Sparrow Eating!");
    }
}

public class main {
    static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }
    static void main() {
        Bird b = new Sparrow();
        b.eat();
        b.fly();

        System.out.println();

        doBirdStuff(new Sparrow());
    }
}

