package TypeCasting;

class Parent
{
	String name="Akh";
	
	void m1()
	{
		System.out.println("This is parent class method");
	}
}

class Child extends Parent{
	int id=90;
	
	void m2()
	{
		System.out.println("This is child class method");

	}
		
}

public class TypeCastingObject {

	public static void main(String[] args) {
	/*	
		Child c=new Child();
		System.out.println(c.name);//parent
		System.out.println(c.id);//child
		c.m1();//parent
		c.m2();//child
	*/	
		
		Parent c=new Child();//upcasting
		System.out.println(c.name);//parent
	//	System.out.println(c.id);//child //we can not access
	    c.m1();//parent
	//	c.m2();//child we can not access
		
		
	}

}
