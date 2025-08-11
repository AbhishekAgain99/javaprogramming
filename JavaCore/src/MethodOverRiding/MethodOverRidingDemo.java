package MethodOverRiding;

class Bank
{
	double roi()
	{
		return 0;
	}
}
class ICiCi extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 12.5;
	}
}

public class MethodOverRidingDemo {

	public static void main(String[] args) {
		
		SBI sb=new SBI();
		System.out.println(sb.roi());
	}

}
