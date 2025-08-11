package rapperClass.AccessModifier;

public class Test1 {
	//private Access modifier can be access within single class
/*	
	 private int x=100;
	
	  private void m1()
	{
		System.out.println("This is m1 method");
		
	}
	  
	  public static void main(String[] args) {
		  Test1 t1=new Test1();
		  System.out.println(t1.x);
		  t1.m1();

		}
*/
	//Default Access Modifier:Only Access Within class or package level
/*	 int x=100;
	
	 void m1()
	{
		System.out.println("This is m1 method");
		
	}
	  
*/
	
	// protector Access Modifier:Access outside of package through inheritance
	
  protected int x=100;
  protected  void m1()
	{
		System.out.println("This is m1 method");
		
	}
  
  //public-directly access all variables & methods everywhere
	

}
