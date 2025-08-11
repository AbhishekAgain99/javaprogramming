package method;

public class Box {
	
	double height,width,depth;
	
	Box()
	{
		height=width=depth=0;
	}
	
	Box(double h,double w,double d)
	{
		height=h;
		width=w;
		depth=d;

	}
	Box(double len)
	{
		height=width=depth=len;

	}
	
	double volume()
	{
		return (height*width*depth);
	}

}
