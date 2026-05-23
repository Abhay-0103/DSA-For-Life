package Collection_Framework_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapBaiscs {
    static void main() {
        Map<String, String> mapping = new HashMap<>();
        // Insertions
        mapping.put("in", "India");
        mapping.put("us", "United States");
        mapping.put("en", "England");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "Brazil");

        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);

        // Deletion
        table.remove("br");
        System.out.println(table);

        table.putIfAbsent("bra", "Brazil3");
        System.out.println(table);

        System.out.println(table.get("bra"));

        System.out.println(table.getOrDefault("us", "NONE"));

//        System.out.println(table.size());
//        table.clear();
//        System.out.println("After: " + table.size());
    }


}
