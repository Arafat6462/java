import java.util.InputMismatchException;

public class Exception7 {
	
 	public static void main( String [] args)
	{
		String string =null;
		int a=0,b=0,c=0,d[]= {1};
		
		
		try {
		
			a=string.length();
			a=b/c;
			a=d[324];
			
		}

		
		catch (NullPointerException  e)
		{
			System.out.println(e+" string length is null");

			
		}
		catch (InputMismatchException  e)
		{
			System.out.println(e);

			
		}
		catch(ArithmeticException   e)
		{
			System.out.println("problem found "+e);
 
		
	}

		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println("problem found "+e);
 
		
	}

		 
		
	}

}
