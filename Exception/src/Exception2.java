
public class Exception2 {

	public static void main(String[] args) {


 		int result=0;
	try {
		  result=div(1000,0);
	}
	catch (ArithmeticException e) {
		    System.out.println(e);
		
	}
		
		
		System.out.println("result is : "+result);
		
		
	}
	public static int div(int a, int b)
	{
		 int result=a/b;
		 return result;
	}

}
