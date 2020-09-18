package day4.exceptionhandling.service;

import java.util.NoSuchElementException;

import day4.exceptionhandling.domain.Book;

public class BookService {

	Book[] bookArray= new Book[10];
	int i=0;
	boolean flag=false;
	
	public Book addOneBook(Book addBook) {
		bookArray[i]= addBook;
		i++;
		return null;
	}
	public Book getOneBook(int bookId) {
		for(int j=0;j<i;j++) {
			if(bookArray[j].getBookId()==bookId) {
				flag=true;
				return bookArray[j];	
			}
			
		if(flag==false)
		{
			throw new NoSuchElementException();
		}
		}
		return null;
	}
	
	public Book[] getAllBook() {
		
		return bookArray;
		
	}
	
}
