package com.dvdlibrary.domain;

public class DVDItem { //implements Comparable<DVDItem>{
	String judul;
	Genre genre;
	int year;
	public DVDItem(String judul, Genre genre, int year) {
		this.judul = judul;
		this.genre = genre;
		this.year = year;
	}
//	@Override
	public int compareTo(DVDItem arg0) {
		return judul.compareTo(arg0.judul);
	}
	@Override
	public String toString() {
		return "DVDItem [judul=" + judul + 
				", genre=" + genre + 
				", year=" + year + "]" + "\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((judul == null) ? 0 : judul.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if(obj != null && obj instanceof DVDItem) {
			DVDItem item = (DVDItem) obj;
			if(judul.equals(item.judul) && genre == item.genre 
					&& year == item.year) {
				res = true;
			}
		}
		return res;
	}	
}