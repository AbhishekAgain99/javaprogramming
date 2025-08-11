package Inheritance;

//single inheritance : single parent have single child

class A
{
	int a;
	
	void display()
	{
		System.out.println(a);
	}	
}
class B extends A
{
	int b;
	
		void show()
		{
			System.out.println(b);
		}
}

public class SingleInheritantce {

	public static void main(String[] args) {
		B objb= new B();
		objb.a=100;
		objb.b=200;
		objb.display();
		objb.show();
		
		
		
		

	}

}
