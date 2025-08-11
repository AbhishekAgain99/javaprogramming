package Inheritance;

class Animal
{
	String colour="White";
	


void food()
{
	System.out.println("eating....");
}

}
class Dog extends Animal
{
	String colour ="Black";
	
	void dispalyColour()
	{
		System.out.println(super.colour);
	}
	
	void food()
	{
		//System.out.println("eating bread....");
		super.food();
	}
}

public class SuperKetword {

	public static void main(String[] args) {
		
		Dog t = new Dog();
		t.dispalyColour();
		
		

	}

}
