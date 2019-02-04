import java.io.* ;
class CheckFile{
	public static void main(String[] args){
	try{
	File f = new File("text.txt");
	System.out.print(f.length());
	}
	catch(Exception e){
	System.out.println(e);
	}
	}
}