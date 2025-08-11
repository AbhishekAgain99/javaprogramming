package method;

public class Student {
	
	String sname;
	int sid;
	char sgrad;
	
	void printStudentData()
	{
		System.out.println(+sid+" "+sname+" "+sgrad);
	}
	void setStudentData(int id, String name,char grad)
	{
		sname=name;
		sid=id;
		sgrad=grad;
	}
	
	Student(int id, String name,char grad)
	{
		sname=name;
		sid=id;
		sgrad=grad;
	}
	

}
