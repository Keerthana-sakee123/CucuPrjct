package org.sample;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DataTbl2 {

	public static void main(String[] args) {
		Map<String,Integer> a=new LinkedHashMap<>();
		a.put("a1", 001);
		a.put("a2", 002);
		a.put("a3", 003);
		
		Map<String,Integer> b=new LinkedHashMap<>();
		b.put("b1", 11);
		b.put("b2", 12);
		b.put("b3", 13);
		
		Map<String,Integer> c=new LinkedHashMap<>();
		c.put("c1", 21);
		c.put("c2", 22);
		c.put("c3", 23);
		//adding maps in a list
		List<Map<String,Integer>> li=new LinkedList<Map<String,Integer>>();
		li.add(a);
		li.add(b);
		li.add(c);
		//iterate the list
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		Map<String, Integer> map = li.get(2);//gives c map
		//System.out.println(map);
		Integer i = map.get("c1");//from map c we can get the value of it
		System.out.println(i);
	}
}
