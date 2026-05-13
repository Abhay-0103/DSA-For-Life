package Inheritance;

public class main {
    static void main() {
        Car c = new Car("BMW", "V8", 4, 5, "Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        System.out.println();

        MotorCycle m = new MotorCycle("Duke", "390", 2, "V", "Extra-Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
