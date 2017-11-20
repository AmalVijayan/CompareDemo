package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import comparatorClasses.EmpSortById;
import comparatorClasses.EmpSortByName;
import pojo.EMPLOYEE;




public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EMPLOYEE e1 = new EMPLOYEE(1,"Bruce Banner",1000000,"Banglore");
		EMPLOYEE e2 = new EMPLOYEE(2,"Barry Allen",10000,"National City");
		EMPLOYEE e3 = new EMPLOYEE(3,"Bruce Wayne",2000000,"Gotham");
		
		ArrayList<EMPLOYEE> all= new ArrayList<EMPLOYEE> ();
		
		all.add(e3);
		all.add(e1);
		all.add(e2);
		
		System.out.println("\n________________Before Sorting____________________\n\n");
		System.out.println("\n########################### EMPLOYEE DETAILS ###########################\n");
		
		for (Iterator iterator = all.iterator(); iterator.hasNext();) {
			EMPLOYEE e = (EMPLOYEE) iterator.next();
			System.out.println("\nEiD: "+e.getEid()+"\nEName: "+e.getName()+"\nSalary: "+e.getSalary()+"\nLocation: "+e.getLocation());;
		}
		
		

//		Collections.sort(al);
		
		EmpSortByName esn= new EmpSortByName();
		EmpSortById esi= new EmpSortById();
	
		Collections.sort(all, esn);
		System.out.println("\n________________After Sorting By Name____________________\n\n");
		
		for (Iterator iterator = all.iterator(); iterator.hasNext();) {
			EMPLOYEE e = (EMPLOYEE) iterator.next();
			System.out.println("\nEiD: "+e.getEid()+"\nEName: "+e.getName()+"\nSalary: "+e.getSalary()+"\nLocation: "+e.getLocation());;
		}
		
		
		Collections.sort(all,esi);
		System.out.println("\n________________After Sorting By Id____________________\n\n");
			
		for (Iterator iterator = all.iterator(); iterator.hasNext();) {
			EMPLOYEE e = (EMPLOYEE) iterator.next();
			System.out.println("\nEiD: "+e.getEid()+"\nEName: "+e.getName()+"\nSalary: "+e.getSalary()+"\nLocation: "+e.getLocation());;
		}
		
		
		
		
	}

}
