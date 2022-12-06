package Servicio;

import com.sun.source.doctree.SinceTree;

import java.util.*;
import java.util.stream.Collectors;

public class MapSort {
    Map<String, Integer> unsorted = new HashMap<>();

    public void start() {
        unsorted.put("z", 10);
        unsorted.put("b", 5);
        unsorted.put("a", 6);
        unsorted.put("c", 20);
        unsorted.put("d", 1);
        unsorted.put("e", 7);
        unsorted.put("y", 8);
        unsorted.put("n", 99);
        unsorted.put("g", 50);
        unsorted.put("m", 2);
        unsorted.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsorted);

        Map<String, Integer> result = unsorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Sorted...");
        System.out.println(result);

    }

}
