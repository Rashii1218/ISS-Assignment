package basics;

public class StringAndArray {
	
	public static void main(String[] args)
	{
		
		String name = "Rashi Lodha";
		String myName = new String("Rashi Lodha");
		
		System.out.println(name.length());      //length of the string
		System.out.println(name.toUpperCase()); //converts string to upperCase
		System.out.println(name.toLowerCase()); //converts string to lowerCase
		// There exists various methods to manipulate a string
		
		//Arrays can be created in two ways
		int[] students = new int[10]; // its an array of 10 students of dataType int and 10 is the size
		int[] marks = {80,45,79,66,42,35,90,98,89,92};
		
		//Processing Arrays
		//for loop
		for(int i=0; i<marks.length; i++)
		{
			System.out.println(marks[i]);
		}
		
		//for-each loop
		for(int mark:marks)
		{
			System.out.println(mark);
		}
		
	}

}
