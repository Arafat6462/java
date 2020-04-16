 
public class Exception5 {
	public static void main(String []args)
	{
		
		int arr[]= {1,3,4,5,5};
		
		int a=0,b=12,result1=0,result2=0,result3=0;
		String s=null;
		
		try {
			
			result1=b/a;
			result2=arr[12];
			result3=s.length();
				
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
