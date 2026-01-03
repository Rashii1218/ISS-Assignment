package Collections;

import java.util.*;

public class SortingStudent {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Rashi"));
        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "Neha"));

        // Sort by ID
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.id - s2.id;
            }
        });

        System.out.println("Students sorted by ID:");
        for (Student s : students) {
            s.display();
        }
    }
}

