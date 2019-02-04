import java.util.* ;
class eg4{
	public static void main ( String [] args){
	try{
	String str = null ;
	System.out.println(str.length());
	}
	catch(NullPointerException e){
	System.out.println("exception occurred ")
	}
	}
}