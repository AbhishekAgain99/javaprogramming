package MethodOverRiding;

class ABC
{
	int a;
	void m1()
	{
	System.out.println(a);	
	}
	
	void  m2(int b)
	{
		System.out.println(b);
	}
}
	class XYZ extends ABC
	{
		void m1()
		{
		System.out.println(a*a);	
		}
		
		void m2(int a, int b)
		{
		System.out.println(a*b);	
		}
	
}

public class MethodOverloadingVSMethodOverRiding {

	public static void main(String[] args) {
	XYZ obj=new XYZ();
	obj.a=10;
	obj.m1();
	obj.m2(11);
	obj.m2(8, 7);
	
	
	}

}
