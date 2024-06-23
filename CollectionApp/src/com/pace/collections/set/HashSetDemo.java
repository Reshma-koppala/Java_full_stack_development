//HashSet is unordered and doesn't allow duplicates
package com.pace.collections.set;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> citySet=new HashSet<String>();
		citySet.add("hyderabad");
		citySet.add("pune");
		citySet.add("banguluru");
		citySet.add("hyderabad");
		
		for(String city:citySet) {
			System.out.println(city);
		}

	}

}
