package com.eminent.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import oracle.net.aso.i;

public class MapTest2 {

	public static void main(String[] args) {
		
			
			HashMap hashMap=new HashMap();
			
			hashMap.put(1, "rollno");
			hashMap.put(2, "name");
			hashMap.put(3, "marks");
			//return key value in Set form
			
			Set s=hashMap.keySet();
			
			for(Object object:s)
			{
				Integer integer=(Integer)object;
				String str=(String)hashMap.get(integer);
				System.out.println(str);
				
				System.out.println(integer);
			}
		}
}
