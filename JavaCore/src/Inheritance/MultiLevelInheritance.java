package Inheritance;

//Multi-Level Inheritance--the inheritance chain continues for more than one level — like a grandparent → parent → child

class X
{
	int a=10;
	void demo1()
	{
		System.out.println(a);
	}
}

class Y extends X
{
	int b=10;
	void demo2()
	{
		System.out.println(b);
	}
}

class Z extends Y
{
	int c=10;
	void demo3()
	{
		System.out.println(c);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Z objz=new Z();
		objz.a=20;
		objz.b=30;
		objz.c=30;
		objz.demo3();
		objz.demo1();
		objz.demo2();
		
		
		
		
	

	}

}
