/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  7/19/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/

import java.io.*;
import java.util.ArrayList;

public class Work 
{
	int count;
	ArrayList<Object> object = new ArrayList<Object>();
	
	public void createObject(int m, int f, int s)
	{
		object.add(new Object(m, f, s));
	}
	
	public void display()
	{
		System.out.println(object.toString());
	}	
	
	public void createBinary() throws IOException
	{
		FileOutputStream outStream = 
				new FileOutputStream("Object.dat");
		ObjectOutputStream objectOutputFile =
				new ObjectOutputStream(outStream);
		
		for(int i = 0; i < object.size(); i++)
		{
			objectOutputFile.writeObject(object.get(i).toString());
		}
		
		objectOutputFile.close();
	}
	
	public void readBinary() throws IOException
	{	
		Object object;
		boolean endOfFile = false;
		
		FileInputStream inStream = 
				new FileInputStream("Object.dat");
		ObjectInputStream objectInputFile =
				new ObjectInputStream(inStream);
		
		ArrayList<Object> binaryObject =
				new ArrayList<Object>();
		
		for(int i = 0; i < binaryObject.size(); i++)
		{
	        try 
	        {
				binaryObject.add((Object) objectInputFile.readObject());
			} 
	        catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
		}
		
		objectInputFile.close();
	}
}
