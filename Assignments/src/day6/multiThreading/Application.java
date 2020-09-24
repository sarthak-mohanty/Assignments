package day6.multiThreading;

import day6.multiThreading.threads.FileReaderThread;
import day6.multiThreading.threads.FileWriterThread;
import java.io.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		
		
	    new FileWriterThread(new File("File1.txt"), "Writer Thread");
	    new FileReaderThread(new File("File1.txt"), "Reader Thread");
		
		
	}

}
