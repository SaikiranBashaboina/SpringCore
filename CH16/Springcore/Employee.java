package CH16.Springcore;

public class Employee {
	int empid;
	String name;
	public Employee()
	{
		
	}
	public void one() {
		System.out.println("I'm InIt");
	}
	
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	public void two() {
		System.out.println("I'm Destroy");
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
}