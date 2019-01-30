import java.util.* ;
class eg{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in) ;
	System.out.println("enter first number");
	int a = in.nextInt();
	System.out.println("enter second number");
	while(true){
		try{
		int b = in.nextInt() ;
		System.out.println(a/b);
		break;

	}
	catch ( InputMismatchException e){
		System.out.println(e);

	}
	//catch(Exception e){
		//System.out.println(e);
	//} 
}
	System.out.println("hellooooooo");
}
}