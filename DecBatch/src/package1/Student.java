package package1;
//  { } indicate this is the boundary(body) of the class
// complete code we will write in the body of the class

public class Student   // piller1
{
    int rollNo;  
    int age;   
    public void display() 
    {
    	System.out.println("Welcome to all of you");
    }
    public static void main(String[] args) // piller2 
    {
	   Student akshay=new Student();  // object creation(piller3)
	   akshay.display();  // piller4(calling the variable/method)
	   akshay.display();
	   akshay.rollNo=123;  //calling + assigning
	   System.out.println(akshay.rollNo);
	   akshay.rollNo=333;
	   System.out.println(akshay.rollNo);
	}
}
