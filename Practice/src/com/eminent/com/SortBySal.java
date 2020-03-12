package com.eminent.com;

import java.util.Comparator;

public class SortBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.sal-o2.sal;
	}

	


	

}
