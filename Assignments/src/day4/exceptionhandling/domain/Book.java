package day4.exceptionhandling.domain;

import day4.exceptionhandling.exception.MyCustomException;
import day4.exceptionhandling.exception.RangeCheckException;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private int price;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String author, int price) {
		super();
		this.bookId = bookId;
		try {
			this.bookName = bookName;
			int exceptionTest= bookName.length();
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Enter a valid bookname");
			e.printStackTrace();
		}
		this.author = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) throws MyCustomException  {
		try {
			int exceptionTest= bookName.length();
		}catch(Exception e){
			throw new MyCustomException("enter a valid name",e);
			//System.out.println("Change this please");
		}
//		if(bookName==null) {
//			throw new MyCustomException("this field cannot be empty");
//		}
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) throws RangeCheckException {
		if(price<100 || price>500) {
			throw new RangeCheckException("Please enter a valid price");
		}
		this.price = price;
	}
	
	
	
	
}
