package Inheritance;
class Test
{
	final int x=100;
}

public class FinalKeyWordVariable {
	
	public static void main(String[] args) {
		
		Test t=new Test();
//		t.x=101;//incorrect bcz x is final variable
		System.out.println(t.x);
		
	}

}
