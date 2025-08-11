package thisKeyword;

public class ThisKeyword {
	int x,y;//class variable or instance variable
/*	 ThisKeyword(int x,int y)
	{
		this.x=x; //this.x this represent class variable
		this.y=y;
	}
*/
	void setData(int x,int y)
	{
		this.x=x;
		this.
		y=y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);

	}
	public static void main(String[] args) {
	
	/*	ThisKeyword key=new ThisKeyword(100,200);
		key.display();
	*/	
		ThisKeyword key=new ThisKeyword();
		key.setData(70, 80);
		key.display();

	}

}
