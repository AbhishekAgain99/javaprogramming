package exceptionHandling;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//	Ex:1	
	/*	System.out.println("Enter a Number..");
		int num = sc.nextInt();
		System.out.println(100/num);//input=0,ArithmeticException
	*/
//	Ex:2
		
	/*	int a[]=new int[5];
		
		System.out.println("Enter the position(0-5):");
		int pos = sc.nextInt();
		
		System.out.println("Enter the value:");
		
		int value = sc.nextInt();
		a[pos]=value; //input:5,ArrayIndexOutOfBoundsException
		System.out.println(pos);
	*/
//		Ex:3
		String s="Welcome";
	int	num=Integer.parseInt(s);
	System.out.println(s);//NumberFormatException
		
	
		
		
	}

}
