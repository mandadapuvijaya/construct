
public class Testconstructorsetmethod {
	public static void main(String[] args) {
		Employee s1=new Employee(1,"vijaya",10000);
		
		s1.setempid(2);
		s1.setempname("xyz");
		s1.getempid();
		
		
	}		
	
}

	
class Employee{
	int empid;
     String empname;
	 int salary;
	 public Employee(int eid,String ename,int sal) {
		 empid=eid;
		 empname=ename;
		 salary=sal;
		 System.out.println(empid+" "+empname+" "+salary);
	 }
public  void setempid(int eid) {
	empid = eid;
	System.out.println(empid);
	}
public  void setempname(String ename) {
	empname=ename;
	System.out.println(empname);
	}
public  void setsalary(int sal) {
	salary= sal;
	System.out.println(salary);
	}
public void getempid() {
	
}

}

		 

