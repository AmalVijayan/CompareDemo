package sorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import pojo.Employee;
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Amal V Nair",1000000,"Banglore");
		Employee e2 = new Employee(2,"Barry Allen",10000,"National City");
		Employee e3 = new Employee(3,"Bruce Wayne",2000000,"Gotham");
		
		ArrayList<Employee> al= new ArrayList<Employee> ();
		
		al.add(e3);
		al.add(e1);
		al.add(e2);
		
		System.out.println("\n________________Before Sorting____________________\n\n");
		System.out.println("\n########################### EMPLOYEE DETAILS ###########################\n");
		
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			System.out.println("\nEiD: "+e.getEid()+"\nEName: "+e.getName()+"\nSalary: "+e.getSalary()+"\nLocation: "+e.getLocation());;
		}
		
		
		System.out.println("\n________________After Sorting____________________\n\n");

		Collections.sort(al);
		
		
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Employee e = (Employee) iterator.next();
			System.out.println("\nEiD: "+e.getEid()+"\nEName: "+e.getName()+"\nSalary: "+e.getSalary()+"\nLocation: "+e.getLocation());;
		}

	}

}
