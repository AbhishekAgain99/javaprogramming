package exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Program is started..");
		String s=null;
		try {
		System.out.println(s.length());
		}
		/*
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());

		}
		catch(NullPointerException e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());

		}
	*/	
		catch(Exception e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());
		}
		finally 
		{
			System.out.println("This i finally block");
		}

	}

}
