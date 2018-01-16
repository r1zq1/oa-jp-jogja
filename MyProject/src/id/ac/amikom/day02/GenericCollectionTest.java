package id.ac.amikom.day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericCollectionTest {
	public static void main(String[] args) {
		// diamond inference
		List<String> myList = new ArrayList<>();
		myList.add("satu");
		myList.add("dua");
//		myList.add(new Integer(3));
		myList.add("empat");
		System.out.println(myList);
		myList.add(2, "tiga");
		myList.set(0, "setunggal");
		System.out.println(myList);	
		Collections.sort(myList);
		System.out.println(myList);
		
		
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "abcdefghi");
		myMap.put(2, "jklmnopqr");
		myMap.put(1, "stuvwxyz");
		System.out.println(myMap.values());
		System.out.println(myMap.keySet());
		System.out.println(myMap.entrySet());
		
		List<?> xx = new ArrayList<>();
		xx.add("satu");
		
	}
}
