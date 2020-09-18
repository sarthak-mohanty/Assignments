package day4.exceptionhandling;

import day4.exceptionhandling.domain.Book;
import day4.exceptionhandling.exception.MyCustomException;
import day4.exceptionhandling.exception.RangeCheckException;
import day4.exceptionhandling.service.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book headFirst= new Book();
		
		try {
			headFirst.setAuthor("author");
			headFirst.setBookId(122);
			headFirst.setBookName("Head First Java");
			headFirst.setPrice(150);
		} catch (MyCustomException e) {
			// TODO Auto-generated catch block
			System.out.println("MyCustomException Caught");
			e.printStackTrace();
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println("RangeCheckException Caught");
			e.printStackTrace();
		}
		
		BookService service= new BookService();
		service.addOneBook(headFirst);
		service.getOneBook(120);
		
		

	}

}
