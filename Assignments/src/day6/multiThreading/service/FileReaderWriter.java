package day6.multiThreading.service;
import java.io.*;
public class FileReaderWriter implements Serializable {

	public synchronized boolean fileReader(File file) {
		boolean flag=false;
		
		try {
			 
		    FileReader reader = new FileReader(file);
		    int charRead = -1;
		    
		    try {
		    	//reads data from the file
		    	Thread.sleep(500);
				while ((charRead = reader.read()) != -1) {
					//wait();
				    System.out.print((char) charRead);
				    flag=true;
				    
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		} catch (FileNotFoundException e) {
		    System.err.println(e);
		}
		return flag;
	}
	
	public synchronized boolean fileWriter(File file) {
		boolean flag=false;
		
		PrintWriter writer=null;
		try {
		 writer=new PrintWriter(new FileWriter(file));
		 writer.println("Hello World");
		 
		 flag=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
			//notify();
		}
		
		return flag;
		
	}
	
}
