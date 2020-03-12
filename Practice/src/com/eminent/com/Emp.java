 package com.eminent.com;

public class Emp {
	
	int eid;
	int sal;
	
	static String ceo;
	
	static
		{
			ceo="salwa";
			System.out.println("in static");
		}
	
	
	Emp()
	{
		eid=1;
		sal=20;
		System.out.println("in constructor");
	}
	
	void show()
	{
		System.out.println(eid+":"+sal+":"+ceo);
	}

}
