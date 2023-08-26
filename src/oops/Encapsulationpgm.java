package oops;

class Emp55{
	private String empName;
	private String empDesignation;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	
	
}

public class Encapsulationpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp55 e=new Emp55();
		e.setEmpName("rahul");
		System.out.println(e.getEmpName());
		e.setEmpDesignation("tester");
		System.out.println(e.getEmpDesignation());
	}

}
