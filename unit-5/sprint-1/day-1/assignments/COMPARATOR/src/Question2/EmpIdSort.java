package Question2;

import java.util.Comparator;

public class EmpIdSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.empId==o2.empId) {
			return 0;
		}
		else if(o1.empId>o2.empId) {
			return 1;
		}
		else {
			return -1;
		}
	}

	}
