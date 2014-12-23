/* 
     Name:  Sean Staz
     Email:  ststasny@go.olemiss.edu
     Current Date:  7/19/13
     Sources Consulted: None. 
     
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort. 
                    ... My Signature is on File. 
*/ 

public class Object 
{
	int miles;
	int feet;
	int seconds;

	public Object()
	{
		int miles = 0;
		int feet = 0;
		int seconds = 0;
	}
	
	public Object(int m, int f, int s)
	{
		setMiles(m);
		setFeet(f);
		setSeconds(s);
	}
	
	public void setMiles(int m)
	{
		miles = m;
	}
	
	public void setFeet(int f)
	{
		feet = f;
	}
	
	public void setSeconds(int s)
	{
		seconds = s;
	}
	
	public int getMiles()
	{
		return miles;
	}
	
	public int getFeet()
	{
		return feet;
	}
	
	public int getSeconds()
	{
		return seconds;
	}
	
	public String toString()
	{
		String str = " Miles: " + miles + " Feet: " + feet + 
				" Seconds: " + seconds;
		return str;
	}
}
