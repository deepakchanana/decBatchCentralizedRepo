package package1;

public class Deepak {

	public Deepak() 
	{
	  System.out.println("Default constructor");
	}

	public Deepak(int a) 
	{
	  System.out.println("One parameterized constructor");
	}
	public Deepak(int a,int b) 
	{
	  this(33); // it will call one parameterized constructor
	  this();
	  System.out.println("two parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
	  System.out.println("main method");
	  Deepak ob=new Deepak(111,444); // control will go to two parameterized cons
	
	  
	}
	
}
