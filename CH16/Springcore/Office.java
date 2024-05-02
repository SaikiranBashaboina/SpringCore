package CH16.Springcore;


import java.util.List;
import java.util.Map;

public class Office {
	int oid;
	String oname;
	Employee emp;
	List<String> projects;
	Map<Integer, String> pdate;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public Map<Integer, String> getPdate() {
		return pdate;
	}
	public void setPdate(Map<Integer, String> pdate) {
		this.pdate = pdate;
	}
	public Office()
	{
		
	}
	public Office(int oid, String oname, Employee emp, List<String> projects, Map<Integer, String> pdate) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.emp = emp;
		this.projects = projects;
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "Office [oid=" + oid + ", oname=" + oname + ", emp=" + emp + ", projects=" + projects + ", pdate="
				+ pdate + "]";
	}
	
	
}