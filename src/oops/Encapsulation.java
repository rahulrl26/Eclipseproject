package oops;

class Emp{
	private String name;
	private String designation;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}






public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.setName("rahul");
		System.out.println(e.getName());
		e.setDesignation("tester");
		System.out.println(e.getDesignation());
		e.setAge(21);
		System.out.println(e.getAge());

	}

}
