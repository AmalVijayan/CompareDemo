package comparatorClasses;
import java.util.Comparator;

import pojo.EMPLOYEE;
public class EmpSortById implements Comparator<EMPLOYEE> {

	@Override
	public int compare(EMPLOYEE e1, EMPLOYEE e2) {
		// TODO Auto-generated method stub
		if(e1.getEid()>e2.getEid())
			return 1;
	
		if(e1.getEid()<e2.getEid())
			return -1;
	
		else 
			return 0;
	}
	
	

	
	
	
}
