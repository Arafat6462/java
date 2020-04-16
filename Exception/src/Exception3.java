
public class Exception3 {
	
	public static void main(String[] args)
	{
		
		
		int a[]= {1,2,3,4},b;
		String s=null;
		
		try {
			
		
	    	System.out.println(a[5]);
	    	b=s.length();
	    	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( e+" not exist ");
			
		}

		catch (NullPointerException  e)
		{
			System.out.println(e+" string length is null");

			
		}
	}

}
