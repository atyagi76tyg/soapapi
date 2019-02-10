package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listex {

	
	public static void main(String[] args) {
	
		
		List<String> list = new LinkedList<String>();
		list.add("java");
		list.add("sql");
		list.add("selenium");
		list.add("Api");
		list.add("Rest");
		list.add("Soap");
		
		/*for(String temp : list)
		{
			System.out.println(temp);
		}
		*/
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
