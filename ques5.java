import java.util.*;
class A
{
	String s;
	A(String S)
	{
	s=S;
	}
	char string()
	{
	return(s.charAt(100));
	}
}
class  B extends A
{
	int a,b;
	B(String s1,int aa,int bb)
	{
	super(s1);
	a=aa;
	b=bb;
	}
	char String()
	{
	return(s.charAt(a+b));
	}
}
class C extends B
{
  	C(String s1,int aa,int bb)
  	{
  	super(s1,aa,bb);
  	}
  	char string()
  	{
  	return(s.charAt(1));
  	}
}
class trycatchques5
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	try
	{
	System.out.println("enter string");
	String s2=in.nextLine();
	System.out.println("enter 2 no.s");
	int aa=in.nextInt();
	int bb=in.nextInt();
	C ob=new C(s2,aa,bb);	
	System.out.println(ob.string());
	}
	catch(Exception e)
	{
	System.out.println("task completed");
	}
	}
}