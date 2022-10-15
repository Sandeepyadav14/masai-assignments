package Question2;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.salary==o2.salary) {
			return o1.empName.compareTo(o2.empName);
		}
		else if(o1.salary>o2.salary) {
			return 1;
		}
		else {
			return -1;
		}
	}

	
   
}
