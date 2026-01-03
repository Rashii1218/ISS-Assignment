package basics;

public class LoopsAndDecisions {
	
	public static void main(String[] args)
	{
		 int marks = 78;

	        //Simple if-else
	        if (marks >= 35) {
	            System.out.println("Result: Pass");
	        }else {
	        	System.out.println("Result: Fail");
	        }


	        //if - else - if ladder
	        if (marks >= 85) {
	            System.out.println("A");
	        } else if (marks >= 70) {
	            System.out.println("B");
	        } else if (marks >= 35) {
	            System.out.println("Pass");
	        } else {
	            System.out.println("Fail");
	        }

	        // switch statement
	        int day = 3;

	        switch (day) {
	            case 1:
	                System.out.println("Monday");
	                break;

	            case 2:
	                System.out.println("Tuesday");
	                break;

	            case 3:
	                System.out.println("Wednesday");
	                break;

	            default:
	                System.out.println("Invalid day");
	        }

	 

	     //LOOPS

	        // for loop (print numbers 1 to 5)
	        System.out.println("For Loop:");
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(i);
	        }

	        System.out.println("----------------------------");

	        // while loop (print even numbers)
	        System.out.println("While Loop:");
	        int num = 2;
	        while (num <= 10) {
	            System.out.println(num);
	            num += 2;
	        }

	        System.out.println("----------------------------");

	        // do-while loop 
	        System.out.println("Do-While Loop:");
	        int count = 1;
	        do {
	            System.out.println("Count: " + count);
	            count++;
	        } while (count <= 3);

	        System.out.println("----------------------------");

	        // 4. break statement
	        System.out.println("Break Example:");
	        for (int i = 1; i <= 5; i++) {
	            if (i == 3) {
	                break; // exits loop when i = 3
	            }
	            System.out.println(i);
	        }

	        System.out.println("----------------------------");

	        // 5. continue statement
	        System.out.println("Continue Example:");
	        for (int i = 1; i <= 5; i++) {
	            if (i == 3) {
	                continue; // skips 3
	            }
	            System.out.println(i);
	        }
	}
}
