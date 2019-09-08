
public class Testconstructor {
	public static void main(String[] args) {
		new Printing(1,"vijaya",1000);
		
	}

}
class Printing{
	 int empid;
	 String empname;
	 int salary;
	 public Printing(int eid,String ename,int sal) {
		 empid=eid;
		 empname=ename;
		 salary=sal;
		 System.out.println(empid+" "+empname+" "+salary);
		 
	 }
	
}
