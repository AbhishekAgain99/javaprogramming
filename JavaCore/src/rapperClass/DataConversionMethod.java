package rapperClass;

public class DataConversionMethod {

	public static void main(String[] args) {
	//String-->integer
		//	String s="welcome";//can not convert into int
	/*	String s1="20";
		String s2="10";
		int int1 = Integer.parseInt(s1);
		int int2 = Integer.parseInt(s2);
		System.out.println(int1+int2);
	*/	
	//String->Double
		String s1="20.5";
		String s2="10.3";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));

	
		String s="true";//otherthan true,if you pass any String that will return false
		System.out.println(Boolean.parseBoolean(s));
	
       //int ,double,bool,char-->String
		
		int a=10;
		double b=20.3;
		char c='A';
		boolean boo=true;
		
		s=String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(b);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(a);
		System.out.println(boo);
	

		}
}
