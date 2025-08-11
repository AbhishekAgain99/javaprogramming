package method;

public class StaticvsNonStatic {
	static int  a=90;
	int b=80;
	
	static void m1()
	{
		System.out.println("Hello :)");
	}
	
	void m2()
	{
		System.out.println("This is non-static method");
	}
	void m3()//non static mathod can access anything directly either static varible or method but it will woke by creating object
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
	
 // System.out.println(a);//static method/variable can access in main method without creating object
 // m1();
  
 // System.out.println(b);//non-static method/variable can not  access in main method without creating object
 // m2();
		StaticvsNonStatic st=new StaticvsNonStatic();
	//	System.out.println(st.b);
		//st.m2();
		st.m3();
		
		

	}

}
