package com.eminent.com;
import java.util.*;

public class TestIterator {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		
		System.out.println(al);
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			Integer integer=(Integer)itr.next();
			if(integer%2==0)
			{
				System.out.println(integer);				
			}
			else 
				itr.remove();
		}
		
		System.out.println(al);
		
		
		
	}

}
