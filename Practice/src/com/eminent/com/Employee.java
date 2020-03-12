package com.eminent.com;

import java.util.Comparator;

public class Employee {
	
	
	public int eid;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String name;
	public int sal;
	
	
	
	Employee(int a,String string,int s)
	{
		this.eid=a;
		this.name=string;
		this.sal=s;
		
	}


}
