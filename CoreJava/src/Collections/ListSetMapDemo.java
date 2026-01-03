package Collections;

import java.util.*;


public class ListSetMapDemo {

    public static void main(String[] args) {

        
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Rashi"));
        list.add(new Student(2, "Amit"));

        System.out.println("List:");
        for (Student s : list) {
            s.display();
        }

        
        Set<Student> set = new HashSet<>();
        set.add(new Student(1, "Rashi"));
        set.add(new Student(1, "Rashi")); // duplicate allowed here 

        System.out.println("\nSet:");
        for (Student s : set) {
            s.display();
        }

    
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(1, "Neha"));
        map.put(2, new Student(2, "Karan"));

        System.out.println("\nMap:");
        for (int key : map.keySet()) {
            map.get(key).display();
        }
    }
}
