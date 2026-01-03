package Oops;

class Circle extends Shapes{
	void draw()
	{
		System.out.println("Drawing a circle");
	}
}

public class Package {
	
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.draw();
	}
}
