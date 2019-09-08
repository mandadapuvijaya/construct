
public class Testconstructoroverloading {
	public static void main(String[] args) {
		new Printingvalue(1,"vijaya");
		new Printingvalue("vijaya",1);
		

	}
}

	
class Printingvalue{
	int empid;
     String empname;
	 int salary;
	 public Printingvalue(int eid,String ename) {
		 empid=eid;
		 empname=ename;
		 
		 System.out.println(empid);
	 }
	 public Printingvalue(String ename,int eid) {
		 empid=eid;
		 empname=ename;
		 
		 System.out.println(empname);
	 }
	
}
