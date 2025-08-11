package method;

public class StudentMain {

	public static void main(String[] args) {
/*	//	by creating objects
	Student s=new Student();
	s.sgrad='A';
	s.sname="Rohn";
	s.sid=19;
	s.printStudentData();
*/
		
	/*//by using method
		Student s=new Student();
		s.setStudentData(108,"vijay", 'A');
		s.printStudentData();
		*/
		Student s=new Student(105,"vishal",'B');
		s.printStudentData();
		
	}

}
