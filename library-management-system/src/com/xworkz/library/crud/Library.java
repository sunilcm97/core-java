package com.xworkz.library.crud;

import com.xworkz.library.dto.BooksDTO;

public interface  Library {
	
	public boolean addingBook(BooksDTO dto);
	public void getBookDetails();
	public boolean updateTypeById(String type, int id);
	public boolean updateNoOfPagesByName( String name, int noOfPages);
	public String getBooks();
	public boolean deleteBookById(int id);
	public boolean deleteBookByName(String name);

}
