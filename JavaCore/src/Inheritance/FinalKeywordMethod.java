package Inheritance;

final class Test1
{
	final void m1()
	{
		System.out.println("This is m1 method of class Test1");
	}
}

class Test2 extends Test1 //incorrect bcz Test1 class is final final class,we can not extend  with

{
//	void m1() //incorrect bcz void m1 from Test1 is final method ,we can not override with final method
	{
		System.out.println("This is m1 method of class Test2");
	}
}

public class FinalKeywordMethod {

	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.m1();
		

	}

}
