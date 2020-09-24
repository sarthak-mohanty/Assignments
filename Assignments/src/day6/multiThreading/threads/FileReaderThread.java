package day6.multiThreading.threads;

import java.io.*;

import day6.multiThreading.service.FileReaderWriter;

public class FileReaderThread implements Runnable {

	
	private File file;
	private String threadName;
	
	private FileReaderWriter service;

	public FileReaderThread(File file, String threadName) {
		super();
		this.file = file;
		this.threadName = threadName;
		//instantiating service
		this.service= new FileReaderWriter();
		
		Thread thread1 = new Thread(this,threadName);
		thread1.start();
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Called by thread------------>"+ Thread.currentThread().getName());
		service.fileReader(file);
		
		
	}

}
