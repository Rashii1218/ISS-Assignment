package Oops;

abstract class Shapes{
	abstract void draw();
	
	void message()
	{
		System.out.println("This is a Shape");
	}
}

class Square extends Shapes{
	void draw()
	{
		System.out.println("Drawing a Square");
	}
}


public class Abstraction {
	
	public static void main(String[] args)
	{
		Shapes s = new Square();
		s.draw();
	}

}
