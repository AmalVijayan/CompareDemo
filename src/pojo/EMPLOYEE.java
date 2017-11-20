package pojo;

public class EMPLOYEE { 
	
	public int getEid() {
		return Eid;
	}


	public String getName() {
		return Name;
	}


	public long getSalary() {
		return Salary;
	}


	public String getLocation() {
		return Location;
	}


	int Eid;
	String Name;
	long Salary;
	String Location;
	

	public EMPLOYEE(int id,String nam,long sal,String loc) {
		// TODO Auto-generated constructor stub
		
		Eid=id;
		Name=nam;
		Salary=sal;
		Location=loc;
	}




}
