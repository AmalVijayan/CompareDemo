
	
	package comparatorClasses;

	import java.util.Comparator;

	import pojo.EMPLOYEE;

	public class EmpSortByName implements Comparator<EMPLOYEE> {

		@Override
		public int compare(EMPLOYEE e1, EMPLOYEE e2) {
			// TODO Auto-generated method stub
			return e1.getName().compareToIgnoreCase(e2.getName()) ;
		}

	}


