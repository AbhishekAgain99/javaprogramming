package Inheritance;
//Hierarchical inheritance : multiple child classes inherit from the same single parent class.

class Parent
{
	int a;
	void show()
	{
		System.out.println(a);
	}
}

class child1 extends Parent
{
	int b;
	void feel()
	{
		System.out.println(b);
	}
}
class child2 extends Parent
{
	int c;
	void glow()
	{
		System.out.println(c);
	}
}
public class HieraricalInheritance {

	public static void main(String[] args) {
		
		child1 child=new child1();
		child.a=10;
		child.b=20;
		child.feel();
		child.show();
		
		
	}

}
