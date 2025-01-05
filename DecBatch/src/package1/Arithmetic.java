package package1;

public class Arithmetic 
{
   public int sum(int a,int b)
   {
	   int c;
	   c=a+b;
	  System.out.println("sum result is "+c);
	   return c;
   }
   public int sub(int x,int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("sub result is "+z);
	   return z;
   }
   public int multi(int d1,int d2)
   {
	   int result;
	   result=d1*d2;
	   return result;
   }
   public static void main(String[] args) 
   {
	   
	 System.out.println("I am main method");  
	 Arithmetic ref=new Arithmetic();
	 System.out.println("Second line of main method");
	 int sumresult=ref.sum(22, 2);
	 int subresult=ref.sub(202, 20);
	 int finalresult=ref.multi(sumresult, subresult);
	 System.out.println("final result is "+finalresult);
	
   }
}
