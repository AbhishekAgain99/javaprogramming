package method;

public class GreetingMain {

	public static void main(String[] args) {
		
		Greetings gr=new Greetings();
		gr.m1();
		String m = gr.m2();
		System.out.println(m);
		
		gr.m3(300);
		
//		int add = gr.m4(30, 40);
//		System.out.println(add);
		
		Greetings.m4(50, 90);
	}

}
