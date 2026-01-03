package Collections;

import java.util.*;


public class SortingPrimitive {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        // Sorting numbers
        Collections.sort(numbers);

        System.out.println("Sorted Numbers:");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
