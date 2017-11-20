package pojo;

public class Employee implements Comparable<Employee> {
	
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
	

	public Employee(int id,String nam,long sal,String loc) {
		// TODO Auto-generated constructor stub
		
		Eid=id;
		Name=nam;
		Salary=sal;
		Location=loc;
	}

    @Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
//		if(this.Eid > e.Eid)
//			return 1;
//		
//		if(this.Eid < e.Eid)
//			return -1;
//		
//		else 
//			return 0;
		
    	return Name.compareTo(e.getName());
    	
    	
	}

}
