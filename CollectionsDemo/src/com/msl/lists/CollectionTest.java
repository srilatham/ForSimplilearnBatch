package com.msl.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		ArrayList<String> locations = new ArrayList<String>();
		locations.add("Hyd");
		locations.add("Blore");
		locations.add("Delhi");
		
		System.out.println("Locations: " + locations);
		Iterator iterator = locations.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//	System.out.println(locations.get(2));
		
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(122);
		hashSet.add(142);
		hashSet.add(512);
		hashSet.add(12);
		//234, 45, 678, 12, 23, 45, 45, 45, 45, 56
		
		System.out.println("set:" + hashSet);
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(10, "Srilatha");
		hashMap.put(20, "Scott");
		hashMap.put(30, "Tom");
		hashMap.put(20, "newvalue");
		
		Collection<String> cl1 = hashMap.values();
		Iterator<String> itr1 = cl1.iterator();
	      while (itr1.hasNext()) {
	    	  String value = itr1.next();
	    	//  Integer key = hashMap.
	         System.out.println(value);
	     }

	}

}
