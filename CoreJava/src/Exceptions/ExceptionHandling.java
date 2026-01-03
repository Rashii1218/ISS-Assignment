package Exceptions;

public class ExceptionHandling {

	static void checkAge(int age) throws Exception{
        if (age < 18) {
            throw new Exception("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        // Handling Unchecked Exception using try-catch-finally
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }


        // Using throw and throws keyword
        try {
            checkAge(16);
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
