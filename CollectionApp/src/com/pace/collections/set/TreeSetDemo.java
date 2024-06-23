//TreeSet is sorted and doesn't allow duplicates
package com.pace.collections.set;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> citySet=new TreeSet<String>();
		citySet.add("hyderabad");
		citySet.add("pune");
		citySet.add("banguluru");
		citySet.add("hyderabad");
         
		for (String city:citySet) {
			System.out.println(city);
		}

	}

}
