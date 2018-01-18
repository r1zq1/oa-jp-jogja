package com.dvdlibrary.service;

import java.util.ArrayList;

import com.dvdlibrary.domain.DVDException;
import com.dvdlibrary.domain.DVDItem;

public class DVDServiceDBImpl implements DVDLibrary {
	
	@Override
	public void addDVDItem(DVDItem item) throws DVDException {
	}
	@Override
	public void updateDVDItem(DVDItem item) throws DVDException {
	}
	@Override
	public void removeDVDItem(DVDItem item) throws DVDException {
	}
	@Override
	public ArrayList<DVDItem> getAllDVDItem() throws DVDException {
		return null;
	}
	@Override
	public DVDItem getDVDItem(String title) throws DVDException {
		return null;
	}
	@Override
	public ArrayList<DVDItem> getDVDItemByGenre(String genre) throws DVDException {
		return null;
	}
}