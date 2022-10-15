package Question2;

import java.util.Comparator;

public class AddressSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		// TODO Auto-generated method stub
		return o1.address.compareTo(o2.address);
	}

	
}
