package OOPS_Intro;

public class app2 {
    static void main() {
        // Encapsulation

        Encapsulation A = new Encapsulation(1, 14, "Chapari", 6, "Chapari Ki GF");
        System.out.println(A.getName());
        System.out.println(A.getAge());

        A.setAge(67);

        System.out.println(A.getAge());

        A.bunk();
        A.study();
        A.sleep();
//        A.gfChatting();
    }
}
