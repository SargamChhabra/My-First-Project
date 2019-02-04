import java.io.*;
class numRead
{
	File f=null;
	int[] N;
	void numfileread()
	{
		N=new int[10];
	try
	  {
	  	f=new File("num");
	   FileReader fin = new FileReader(f);
	   BufferedReader bin=new BufferedReader(fin);
	   for(int i=0;i<10;i++)
	   {
	   	N[i]=Integer.parseInt(bin.readLine());
	   }
	  }
	  catch(Exception e){}
	  for(int i=0;i<10;i++)
	  {
	  	System.out.println(N[i]+" ");
	  }
	}
	void numSort()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(N[i]>N[j])
				{
					int t=N[i];
					N[i]=N[j];
					N[j]=t;
				}
			}
		}
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
			System.out.println(N);
		    }
		}
	}
}
class mainclass
{
	public static void main(String[] args)
	{
		numRead nr=new numRead();
		nr.numfileread();
	}
}