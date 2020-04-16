import java.util.Scanner;

  class Aiub_2_Pizza_Cutting {
 
	public static void main(String[] args) 
	{
 
	 Scanner in=new Scanner(System.in);

		 long  n=0,result=0;
		 
		 n=in.nextLong();
		
		
	  while(n>=0)
	   {
		 result=n*(n+1);
		 result/=2+1;
		 System.out.println(result);
		 n=in.nextLong();
		 
		 }
	
	
		
	}

	 
}
