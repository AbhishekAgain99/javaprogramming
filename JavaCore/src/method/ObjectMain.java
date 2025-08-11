package method;

public class ObjectMain {

	public static void main(String[] args) {
		 System.out.println(StaticvsNonStatic.a);//static method/variable can access in main method without creating object
		 StaticvsNonStatic.m1();
		  
		 // System.out.println(b);//non-static method/variable can not  access in main method without creating object
		 // m2();
				StaticvsNonStatic st=new StaticvsNonStatic();
			//	System.out.println(st.b);
				//st.m2();
				st.m3();

	}

}
