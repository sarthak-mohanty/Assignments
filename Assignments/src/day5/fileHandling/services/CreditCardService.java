package day5.fileHandling.services;
import java.io.*;

import day5.fileHandling.model.CreditCard;

public class CreditCardService {

	public boolean storeByte(CreditCard[] creditCard , File file) {
		boolean persisted=false;
		ObjectOutputStream outStream = null;
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(file));
			persisted=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			outStream.writeObject(creditCard);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persisted;
	}
	
	public boolean storeByte(CreditCard[] creditCard , File file , String path) {
		boolean persisted=false;
		ObjectOutputStream outStream = null;
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(path + file));
			persisted=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			outStream.writeObject(creditCard);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persisted;
	}
	
     public boolean storeChar(CreditCard[] creditCard, File file, boolean append) {
		boolean persisted=false;
		PrintWriter outStream = null;
		String s = null;
		try {
			outStream = new PrintWriter(new FileWriter(file, append));
			persisted=true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (CreditCard eachCreditCard : creditCard) {
		s =  eachCreditCard.toString();
		outStream.println(s);
		}
		outStream.close();
		return persisted;
		
		
	}
     
     public boolean storeChar(CreditCard[] creditCard, File file, String path) {
    	boolean persisted=false;
 		PrintWriter outStream = null;
 		String s = null;
 		try {
 			outStream = new PrintWriter(new FileWriter(path + file, true));
 			persisted=true;
 		} catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		for (CreditCard eachCreditCard : creditCard) {
 		s =  eachCreditCard.toString();
 		outStream.println(s);
 		}
 		outStream.close();
 		return persisted;
 		
 		
 	}
     
     public CreditCard retrieveByte(File file, int search) {
    		CreditCard[] creditCard=null;
    		CreditCard card= null;
    		boolean value=false;
    		
    		
    		ObjectInputStream inStream = null;
    		try {
    			inStream= new ObjectInputStream(new FileInputStream(file));
//    			System.out.println(inStream.readObject());
    			 creditCard=(CreditCard[])inStream.readObject();
    			// System.out.println(creditCard[0]);
    			 for(int i=0;i<3;i++) {
    				 if(creditCard[i].getCreditCardNumber()==search) {
    					 value=true;
    					return  creditCard[i];
    				 }
    			 }
    			 
    			 if(value==false) {
    				 return card;
    			 }
//    			 
    		} catch (IOException e) {
    			System.err.println(e.getMessage());
    		} 
    		catch (ClassNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		finally {
    			try {
    				inStream.close();
    			}catch(IOException e) {
    				System.err.println(e.getMessage());
    			}
    		}
    		
    		return card;
    		
    		
    	}

     
     public CreditCard retrieveChar(File file, int search) throws IOException {
    	 CreditCard[] card=new CreditCard[3];
    	 CreditCard creditCard=null;
    	 BufferedReader reader=null;
    	 try {
    		 reader=new BufferedReader(new FileReader(file));
    		 String attribute[] = new String[3];
    		 String values= null;
    		 
    		 while ((values = reader.readLine()) != null) {
					attribute = values.split(",");
					if(Long.parseLong(attribute[0].trim()) == search) {
					creditCard = new CreditCard(Long.parseLong(attribute[0].trim()),attribute[1]);
					return creditCard;
					}
    		 }
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	 finally {
    		 reader.close();
    	 }
    	 	 
    	 return creditCard;
    	 
     }
     
     public boolean deleteDataChar(File file, int key) throws IOException {
    	 CreditCard[] card=new CreditCard[2];
    	 CreditCard creditCard=null;
    	 BufferedReader reader=null;
    	 PrintWriter outStream = null;
    	 boolean deleted=false;
    	 boolean flag=true;
    	 String s=null;
    	 int check=0;
    	 try {
    		 reader=new BufferedReader(new FileReader(file));
    		 String attribute[] = new String[3];
    		 String values= null;
    		 
    		 while ((values = reader.readLine()) != null) {
					attribute = values.split(",");
					if(Long.parseLong(attribute[0].trim()) == key) {
					  	flag=true;
					}
					if(Long.parseLong(attribute[0].trim()) != key) {
					card[check]=new CreditCard(Long.parseLong(attribute[0].trim()),attribute[1]);
					check++;
					}
					
    		 }
				if(flag==true) {
				storeChar(card,file,false);
				return flag;
				}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	 finally {
    		 reader.close();
    	 }
    	 	 
    	 return deleted;
    	 
     }
     
     public boolean deleteDataByte(File file, int key) {
 		CreditCard[] creditCard=null;
 		CreditCard[] card= new CreditCard[3];
 		boolean value=false;
 		ObjectOutputStream outStream = null;
 		
 		
 		ObjectInputStream inStream = null;
 		try {
 			inStream= new ObjectInputStream(new FileInputStream(file));
// 			System.out.println(inStream.readObject());
 			 creditCard=(CreditCard[])inStream.readObject();
 			// System.out.println(creditCard[0]);
 			 for(int i=0;i<3;i++) {
 				 if(creditCard[i].getCreditCardNumber()!=key) {
 					 card[i]=creditCard[i];
 				 }
 			 }
 			 
 			outStream = new ObjectOutputStream(new FileOutputStream(file));
 			try {
 				outStream.writeObject(card);
 				value=true;
 			} catch (FileNotFoundException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			} catch (IOException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
// 			 
 		} catch (IOException e) {
 			System.err.println(e.getMessage());
 		} 
 		catch (ClassNotFoundException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		finally {
 			try {
 				inStream.close();
 			}catch(IOException e) {
 				System.err.println(e.getMessage());
 			}
 		}
 		
 		return value;
 		
 		
 	}

     public boolean delete(int option,File file,int key) throws IOException {
    	 if(option==1) {
    		 return deleteDataByte(file,key);
    	 }else {
    		 return deleteDataChar(file,key);
    	 }
     }
     
	
	}
	

	



