package com.dvdlibrary.domain;

import java.util.Comparator;

public class DVDYearComparator implements Comparator<DVDItem>{
	@Override
	public int compare(DVDItem item1, DVDItem item2) {
		int selisih = item1.year - item2.year;
		if(selisih < 0) {
			return -1;
		} else if(selisih == 0){
			return item1.judul.compareTo(item2.judul);
		} else {
			return 1;
		}
	}
}