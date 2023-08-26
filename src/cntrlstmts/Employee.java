package cntrlstmts;

public class Employee {
	
	String empname;
	String empdesignation;
	String empid;

	public Employee(String empname,String empdesignation,String empid)
	{
		this.empname=empname;
		this.empdesignation=empdesignation;
		this.empid=empid;
	}
	
	public void display()
	{
		System.out.println("empname="+empname);
		System.out.println("empdesignation="+empdesignation);
		System.out.println("empid="+empid);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("rahul","tester","101");
			
		
	
		emp1.display();
		
	
		
	
	
	
	
	
	
	
	}	
	
}
