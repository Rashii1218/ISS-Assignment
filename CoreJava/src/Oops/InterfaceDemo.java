package Oops;

interface Animals {
	public void eat();
	public void makeSound();
}

public class InterfaceDemo implements Animals {
	
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
	public void makeSound()
	{
		System.out.println("Animal is making a sound");
	}
	
	public static void main(String[] args)
	{
		InterfaceDemo a1 = new InterfaceDemo();
		a1.eat();
		a1.makeSound();
	}

}
