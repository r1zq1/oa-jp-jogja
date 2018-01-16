package com.dvdlibrary.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.dvdlibrary.domain.DVDItem;
import com.dvdlibrary.domain.DVDYearComparator;
import com.dvdlibrary.domain.Genre;

public class DVDItemTest {
	public static void main(String[] args) {
		DVDItem item1 = new DVDItem("Superman", Genre.ACTION, 2012);
		DVDItem item2 = new DVDItem("AADC", Genre.HORROR, 2018);
		DVDItem item3 = new DVDItem("Doraemon", Genre.ANIMATION, 2010);
		DVDItem item4 = new DVDItem("Spiderman", Genre.ACTION, 2012);
		DVDItem item5 = new DVDItem("AADC", Genre.HORROR, 2018);
		
//		List<DVDItem> items = new ArrayList<>();
		Set<DVDItem> items = new HashSet<>();  //--> natural ordering
//		Set<DVDItem> items = new TreeSet<>(new DVDYearComparator());
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		
		System.out.println(item2.equals(item5));
		System.out.println(item2.hashCode() == item5.hashCode());
		
//		Collections.sort(items); // --> natural ordering
//		Collections.sort(items, new DVDYearComparator());
		
		System.out.println(items);
	}
}
