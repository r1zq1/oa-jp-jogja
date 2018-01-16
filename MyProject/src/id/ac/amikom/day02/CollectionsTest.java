package id.ac.amikom.day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		Set mySet = new HashSet();
		mySet.add("satu");
		System.out.println(mySet.add("dua"));
		mySet.add(new Integer(3));
		mySet.add(new Float(4.0F));
		mySet.add("lima");
		System.out.println(mySet.add("dua"));
		mySet.add(new Integer(3));		
		System.out.println(mySet);
		
		List myList = new ArrayList();
		myList.add("satu");
		System.out.println(myList.add("dua"));
		myList.add(new Integer(3));
		myList.add(new Float(4.0F));
		myList.add("lima");
		System.out.println(myList.add("dua"));
		myList.add(new Integer(3));		
		System.out.println(myList);
		
		Map myMap = new HashMap();
		myMap.put("key 1", "element 1");
		myMap.put("dua", new Double(2.0));
		myMap.put("tiga", new Integer(3));
		myMap.put("dua", "element 2 yang baru");
		System.out.println(myMap.values());
		System.out.println(myMap.keySet());
		System.out.println(myMap.entrySet());
	}
}