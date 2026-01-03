package basics;

// Basics of Java

class Employee{
	String empName;        //Instance variable
	int empId;            //Instance  variable
	
	//constructor
	Employee(String name, int id)
	{
		empName = name;
		empId = id;
	}
	
	//method
	void displayEmployeeInfo()
	{
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id: " + empId);
	}
}

public class Basics {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Rashi Lodha", 100);   //Object Creation
		emp1.displayEmployeeInfo();
	}
	
}
