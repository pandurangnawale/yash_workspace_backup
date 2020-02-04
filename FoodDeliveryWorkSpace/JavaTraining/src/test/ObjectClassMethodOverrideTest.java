package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectClassMethodOverrideTest {
		
	/*@Override
	String toString(){
		
	}*/
	//we can not override object class methods in interface
	
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		Integer i=10;
		String str="xyz";
		al.add(i);
		al.add(str);
	//	System.out.println(al.get(1));
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
}
