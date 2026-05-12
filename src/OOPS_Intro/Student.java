package OOPS_Intro;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default Constructor  // By def -> garbage
    public Student() {
        System.out.println("Student Default Constructor Called");
    }

    // Parameterised Constructor
    public Student(int id, int age, String name, int nos) {
        System.out.println("Student Parameterised Constructor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy Constructor
    public Student(Student srcobj) { // srcobj -> A
        System.out.println("Student Copy Constructor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Methods/Behaviours
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }
}

