package com.eminent.com;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablezTest {

	public static void main(String[] args) {
	
		
		
		
		Employee e1=new Employee(101,"sal",1222);
		Employee e2=new Employee(210, "sall", 9090);
		
		Employee e3=new Employee(210, "sall", 909090);
		
		ArrayList al= new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al);
		
		for(Object o:al)
		{
			if(o instanceof Employee)
			{
				Employee e =(Employee)o;
			
				System.out.println(e.getEid());
				System.out.println(e.getName());
				System.out.println(e.getSal());
				
			
			}
				
		}
		

	}

}
