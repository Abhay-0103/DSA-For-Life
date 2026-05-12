package OOPS_Intro;

public class app {
    static void main() {
        // Default const

//        Student A = new Student();
//        A.id = 1;
//        A.age = 14;
//        A.name = "Meoww";
//        A.nos = 5; // number of sub
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();


        // Now Calling parameterised
        System.out.println();

        Student A =new Student(1, 12, "Ghooppp", 9);

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        A.study();
        A.bunk();
        A.sleep();


        // Copy Constructor

//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.nos);
//        System.out.println(B.age);
//        System.out.println(B.id);

//        B.bunk();


    }
}
