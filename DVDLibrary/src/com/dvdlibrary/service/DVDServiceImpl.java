package com.dvdlibrary.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dvdlibrary.domain.DVDException;
import com.dvdlibrary.domain.DVDItem;
import com.dvdlibrary.domain.Genre;

public class DVDServiceImpl implements DVDLibraryService{
	private ArrayList<DVDItem> dvds;
	private final static DVDServiceImpl instance =
			new DVDServiceImpl();
	private DVDServiceImpl() {
		dvds = new ArrayList<>();
		dvds.add(new DVDItem("Hantu Cantik Kok Ngompol?", Genre.HORROR, 2016));
		dvds.add(new DVDItem("Surat Dari Praha", Genre.DRAMA, 2016));
		dvds.add(new DVDItem("Dibalik 98", Genre.DRAMA, 2015));
		dvds.add(new DVDItem("Pesantren Impian", Genre.DRAMA, 2016));
		dvds.add(new DVDItem("Raksasa dari Jogja", Genre.DRAMA, 2016));
		dvds.add(new DVDItem("My Stupid Boss", Genre.COMEDY, 2016));
		dvds.add(new DVDItem("Air & Api", Genre.ACTION, 2015));
		dvds.add(new DVDItem("oo Nina Bobo", Genre.HORROR, 2014));
		dvds.add(new DVDItem("Nenek Siam", Genre.HORROR, 2015));
	}
	public static DVDServiceImpl getInstance() {
		return instance;
	}
	@Override
	public void addDVDItem(DVDItem item) throws DVDException {
		boolean found = dvds.contains(item);
		if(!found) {
			dvds.add(item);
		} else {
			throw new DVDException(item.getJudul() + " sudah terdaftar");
		}
	}

	@Override
	public void updateDVDItem(DVDItem item) throws DVDException {
		boolean result = dvds.contains(item);
		if(!result) {
			throw new DVDException(item.getJudul() + " tidak ditemukan");			
		} else {
			dvds.set(dvds.indexOf(item), item);
		}
	}

	@Override
	public void removeDVDItem(DVDItem item) throws DVDException {
		boolean result = dvds.contains(item);
		if(!result) {
			throw new DVDException(item.getJudul() + " tidak ditemukan");			
		} else {
			dvds.remove(item);
			
		}		
	}

	@Override
	public ArrayList<DVDItem> getAllDVDItem() throws DVDException {
		return dvds;
	}

	@Override
	public DVDItem getDVDItem(String title) throws DVDException {
		DVDItem item = new DVDItem(title, null, 0);
		boolean result = dvds.contains(item);
		if(!result) {
			throw new DVDException(item.getJudul() + " tidak ditemukan");			
		}
		return dvds.get(dvds.indexOf(item));
	}

	@Override
	public ArrayList<DVDItem> getDVDItemByGenre(String genre) throws DVDException {
		List<DVDItem> dvdsByGenre = 
				dvds.stream()
					.filter(dvd -> dvd.getGenre().toString() == genre.toUpperCase())
					.collect(Collectors.toList());
		return (ArrayList<DVDItem>)dvdsByGenre;
	}
}
