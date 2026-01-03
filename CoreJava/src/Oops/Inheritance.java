package Oops;
class Animal{
	
	public void makeSound()
	{
		System.out.println("Animals make a sound");
	}
}

class Dog extends Animal{
	
	@Override
	public void makeSound()
	{
		System.out.println("Dogs bark");
	}
}
public class Inheritance {
	
	public static void main(String[] args)
	{
		Animal animal = new Dog();
		animal.makeSound();
	}

}
