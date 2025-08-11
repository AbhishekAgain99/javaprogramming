package exceptionHandling;

public class ThrowsException {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started..");
		
		Thread.sleep(3000);

	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	*/	
		
		System.out.println("program is executed");


	}

}
