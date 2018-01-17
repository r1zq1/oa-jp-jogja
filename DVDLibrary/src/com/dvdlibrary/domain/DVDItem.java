package com.dvdlibrary.domain;

public class DVDItem { // implements Comparable<DVDItem>{
	String judul;
	Genre genre;
	int year;

	public DVDItem(String judul, Genre genre, int year) {
		this.judul = judul;
		this.genre = genre;
		this.year = year;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// @Override
	public int compareTo(DVDItem arg0) {
		return judul.compareTo(arg0.judul);
	}

	@Override
	public String toString() {
		return "DVDItem [judul=" + judul + ", genre=" + genre + ", year=" + year + "]" + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((judul == null) ? 0 : judul.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if (obj != null && obj instanceof DVDItem) {
			DVDItem item = (DVDItem) obj;
			if (judul.equals(item.judul)) {
				res = true;
			}
		}
		return res;
	}
}