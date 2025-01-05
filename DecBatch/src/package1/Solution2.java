package package1;

public class Solution2 {
   int a,b,c,d,e;
   public void method1(int a1,int a2,int a3,int a4,int a5)
   {
	   a=a1;
	   b=a2;
	   c=a3;
	   d=a4;
	   e=a5;
   }
   public static void main(String[] args) 
   {
	Solution2 ob=new Solution2();
	ob.method1(11, 1112, 113, 14, 2225);
	System.out.println(ob.a);
	System.out.println(ob.b);
	System.out.println(ob.c);
	System.out.println(ob.d);
	System.out.println(ob.e);
   }
}
