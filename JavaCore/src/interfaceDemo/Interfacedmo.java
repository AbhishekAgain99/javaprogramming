package interfaceDemo;

interface Shape
{
	int length=10; //static , final
	int width=20; //static , final
	
	void circle();
	
	default void sqare()
	{
		System.out.println("This is Square..");
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle..");
	}	
	
}


public class Interfacedmo implements Shape
{
  public  void circle()
   {
	System.out.println("This is circle..");
   }
  
  void  triangle()
  {
	  System.out.println("This is tri-angle");
  }
  

	public static void main(String[] args) {
/*		Interfacedmo intobj =new Interfacedmo();
		intobj.sqare(); //default method
		intobj.circle();//abstract method
		Shape.rectangle();//static method
*/		
		
		
		Shape intobj =new Interfacedmo();
		intobj.circle();
		intobj.sqare();
		Shape.rectangle();
	//	intobj.triangle(); This can not access
		

		

	}

}
