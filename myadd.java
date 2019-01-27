importjava.util.*;
class myadd{
	int first;
	int second;
	add(int x ,int y)
	{
	first = x;
	second=y;
 }
	int addfn()
	{
	return first+second; 
	}
	add(){
		first=0;
		second=0;
	}
	System.out.println("first"+first);
	System.out.println("second"+second);
	}
	

	}
	class add_main
	{
	public static void main(String[]args)
	{
	Scanner in = new Scanner(System.in);
	int  a,b ;
	System.out.println("enter first element");
	System.out.println("enter second element");
	a=in.next();
	b=in.next();
	add a1=new add(a,b);
	a1.addfn();
	System.out.println("sum=" + a1.addfn());
	add a2 = new add();
	System.out.println("sum="+a2.addfn());
}
}