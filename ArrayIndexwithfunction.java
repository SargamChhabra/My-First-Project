import java.util.*;
public class Arrayindexwithfunction{
	int selement;
	int counter=0;
	Scanner scan=new Scanner(System.in);
	int element[]=new int[10];
	int flag=-1;

	void enterelements()
	{
	    System.out.println("enter 10 elements in array");
	    for(counter=0; counter<10;counter++)
	    {
	        element[counter]=scan.nextInt();
	    }

	}
void displayelement()
{
	System.out.println("the following elements were entered in array");
	    for(counter=0; counter<10;counter++)
	    {
				        System.out.println(element[counter]);}
}
}