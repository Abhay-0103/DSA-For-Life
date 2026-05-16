package Polymorphism;

public class main {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,5,4,33));
//        System.out.println(c.add(4,5));
//        System.out.println(c.add(4,78,12));


        // Runtime Polymorphism
        Circle c = new Circle();
        c.draw();

        // Upcasting
        doDrawingStuff(c);

        Ract r = new Ract();
        r.draw();

        // Upcasting
        doDrawingStuff(r);

        Shape s = new Shape();
        doDrawingStuff(s);
    }

    public static void doDrawingStuff(Shape s) {
        s.draw();
    }
}
