package Collections;

/*
 * Simple Student class
 */

public class Student {

    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display student details
    void display() {
        System.out.println(id + " " + name);
    }
}
