package org.sample;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataTbl1 {
	public static void main(String[] args) {
		
	
List<Integer> a=new LinkedList<Integer>();
a.add(10);
a.add(20);
a.add(30);
//return type of get(index) will be Integer not int
Integer integer = a.get(0);
List<Integer> b=new LinkedList<Integer>();
b.add(40);
b.add(50);
b.add(60);

List<Integer> c=new LinkedList<Integer>();
c.add(70);
c.add(80);
c.add(90);
//adding all th list into a list
List<List<Integer>> l=new LinkedList<List<Integer>>();
l.add(a);
l.add(b);
l.add(c);

//we want to print 40

List<Integer> blist = l.get(1);//this will return the b list so we getlist<integer> as return type
Integer i = blist.get(0);
System.out.println(i);
//adding list in a map
Map<String,List<Integer>> m=new LinkedHashMap<>();
m.put("alist", a);
m.put("blist", b);
m.put("clist",c);

List<Integer> list = m.get("clist");
Integer value = list.get(1);
System.out.println(value);



}
}
