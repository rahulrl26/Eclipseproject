package oops;


class Member{
	String name;
	int  age;
	long phoneno;
	String address;
	int salary;
	
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phoneno);
		System.out.println(address);
		System.out.println(salary);
	}
	
}

class Employee extends Member{
	
	String specification;
}
class Manager extends Member{
	
	String department;
}



public class Hierarchialinheritence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee();
		emp1.name="rahul";
		emp1.age=21;
		emp1.phoneno=21433525342522l;
		emp1.address="iwuepue";
		emp1.salary=30000;
		emp1.printdetails();
		System.out.println(emp1.specification="testing");
		
		
		Manager m=new Manager();
		m.name="ariya";
		m.age=20;
		m.salary=40000;
		m.phoneno=5252222222l;
		m.address="haihaha";
		m.printdetails();
		System.out.println(m.department="health");
		
				
		
	}

}
