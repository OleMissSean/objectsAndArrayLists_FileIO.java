/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  7/19/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

import java.io.IOException;

public class Driver
{
	public static void main(String[] args) throws IOException
	{
		Work work1 = new Work();
		work1.createObject(1, 2, 3);
		work1.display();
		work1.createBinary();
		work1.readBinary();
		work1.display();
		
		System.out.println("");
		
		Work work2 = new Work();
		work2.createObject(3, 4, 5);
		work2.display();
		work2.createBinary();
		work2.readBinary();
		work2.display();
		
		System.out.println("");
		
		Work work3 = new Work();
		work3.createObject(4, 5, 6);
		work3.display();
		work3.createBinary();
		work3.readBinary();
		work3.display();
		
		System.out.println("");
		
		Work work4 = new Work();
		work4.createObject(5, 6, 7);
		work4.display();
		work4.createBinary();
		work4.readBinary();
		work4.display();

		System.out.println("");
		
		Work work5 = new Work();
		work5.createObject(2, 3, 4);
		work5.display();
		work5.createBinary();
		work5.readBinary();
		work5.display();
	}
}
