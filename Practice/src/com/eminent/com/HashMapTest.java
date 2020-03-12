package com.eminent.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		
		HashMap hashMap=new HashMap();
		
		hashMap.put(1, "rollno");
		hashMap.put(2, "name");
		hashMap.put(3, "marks");
		//return key value in Set form
		Set s=hashMap.entrySet();
		
		for(Object object:s)
		{
			Map.Entry me=(Map.Entry)object;
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}
		

	}

}
