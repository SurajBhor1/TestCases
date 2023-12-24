package cllectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class Array_list {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	HashSet<String>hs=new HashSet<>();
	hs.add("34");
	
	al.add("suraj");
	al.add(1992);
	al.add(78.5);
	al.add(true);
	al.add('v');//  
	
al.set(1, 2000);//                                        //updated 
al.add(400);
	System.out.println(al);
System.out.println(al.size());
for(int i=0;i<al.size();i++) 
{
System.out.println(al.get(i));
}
al.size();
ListIterator Litr=al.listIterator();// list iterator
while(Litr.hasNext()) 
{ 
System.out.println(Litr.next()); 
} 
for(Object s:al) {                             // for each loop
	System.out.println(s);
}
	
}
}
	
	


