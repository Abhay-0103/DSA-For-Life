package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {
    static void main() {
        // List or Collection -> Interface

        // Arraylist -> Concrete Class
        ArrayList<Integer> list = new ArrayList<>();
        // Can give any name

//  List<Integer> list = new ArrayList<>();
//  Collection<Integer> collection = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        // Add All
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(202);

        System.out.println();
        System.out.println("Printing List 2");
        list.addAll(list2);
        System.out.println(list2);
        list.removeAll(list2);
        System.out.println();
        System.out.println("Chall");
        System.out.println(list);

        System.out.println(list.size());

        // Traverse List Using Iterator
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }
    }

}

