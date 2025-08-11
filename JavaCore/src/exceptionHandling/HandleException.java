package exceptionHandling;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		//Ex:1	
		
		Scanner sc=new Scanner(System.in);

			System.out.println("Enter a Number..");
			int num = sc.nextInt();
			try {
			System.out.println(100/num);//input=0,ArithmeticException
			}
			catch(ArithmeticException e)
			{
				System.out.println("Invailid num");
			}
	}

}
