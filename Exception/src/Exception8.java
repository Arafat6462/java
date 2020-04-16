
public class Exception8 {

	public static void main(String[] args) {


 		int a=50,b=0,c=0;
		
		
		try {
		
			c=a/b;
		}

		
		catch (ArithmeticException  e)
		{
			System.out.println(e+" can't divide");

			
		}
		finally {
			
			System.out.println("\n please try again ");

		}
	}

}
