import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception6 {
	
	static Scanner in=new Scanner(System.in);
	public static void main( String [] args)
	{
		int a = 0,b=9,c=0;
		
		
		try {
		
			a=in.nextInt();
			c=b/a;
 			
		}

		
		catch (InputMismatchException  e)
		{
			System.out.println(e);

			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("problem found "+e);
 
		
	}

		catch (NullPointerException  e)
		{
			System.out.println(e+" string length is null");

			
		}
		
		
	}

}
