
public class Testthiskeyword {
	public static void main(String[] args) {
		new Student(1,"navya");
	}

}
class Student{
	int id;
	String sname;
	public Student(int id,String sname) {
		this.id=id;
		this.sname=sname;
		System.out.println(id+" " +sname);
	}
	
}