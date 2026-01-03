package basics;

import java.util.*;

class Student{
	
	//Instance variables
	public String name;         //public: can be accessed anywhere
	protected int rollNo;      //protected: can be accessed in the same package or subclass
	private double marks;     //private: can be accessed in the same class
	
	final String collegeName = "SPIT";    //final: value cannot be changed
	
	//constructor
	Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
	
	void displayStudentDetails() {
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Marks       : " + marks);
        System.out.println("College     : " + collegeName);
    }
}

public class DataTypes {
	
	static String course = "Computer Science";
	//static: shared by all objects
	
	public static void main(String[] args)
	{
		//Basic DataTypes
		
		int age = 22;        
		float height = 5.2f;
		double percentage = 89.66;
		char grade = 'A';
		boolean isPassed = true;
        
        
        Student s1 = new Student("Rashi Lodha", 51, 90);
        System.out.println("Course      : "+ course);
        s1.displayStudentDetails();
        
		
	}
}
