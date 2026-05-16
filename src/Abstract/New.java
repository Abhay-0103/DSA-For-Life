package Abstract;

public class New {
    // Interface

    interface Bird {
        void fly();
        void eat();
    }

    static class Sparrow implements Bird {

        @Override
        public void fly() {
            System.out.println("Sparrow flying!");
        }

        @Override
        public void eat() {
            System.out.println("Sparrow eating!");
        }
    }


        public static void doBirdStuff(Bird b) {
            b.eat();
            b.fly();
        }

        public static void main(String[] args) {
            doBirdStuff(new Sparrow());
        }

}

