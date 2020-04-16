
public class Exception4 {
	
	public static void main(String []args)
	{
		
		int arr[]= {1,3,4,5,5};
		
		int a=1,b=12,result1=0,result2=0;
		
		try {
			
			result1=b/a;
			result2=arr[12];
				
		}
		catch(ArithmeticException  e)
		{
			System.out.println("you can't "+e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+" can't find");

		}
		
		
	}

}
