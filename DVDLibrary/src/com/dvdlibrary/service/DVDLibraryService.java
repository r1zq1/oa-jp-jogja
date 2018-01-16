package com.dvdlibrary.service;

import java.util.ArrayList;

import com.dvdlibrary.domain.DVDException;
import com.dvdlibrary.domain.DVDItem;

public interface DVDLibraryService {
	void addDVDItem(DVDItem item) throws DVDException;
	void updateDVDItem(DVDItem item) throws DVDException;
	void removeDVDItem(DVDItem item) throws DVDException;
	ArrayList<DVDItem> getAllDVDItem() throws DVDException;
	DVDItem getDVDItem(String title) throws DVDException;
	ArrayList<DVDItem> getDVDItemByGenre(String genre) throws DVDException;	
}