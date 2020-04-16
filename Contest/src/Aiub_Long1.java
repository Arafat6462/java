import java.util.Scanner;

  class Aiub_Long1 {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {

		int testcase=scanner.nextInt();
		for(int i=0; i<testcase; i++)
		{
			int n,r;
			n=scanner.nextInt();
			r=scanner.nextInt();
			
			int nfactorial=factorial(n);
 			int rfacrotial=factorial(r);
			int n_r_difference=factorial(n-r);

			
			int result=(nfactorial/(rfacrotial*n_r_difference))%1000003;
			System.out.println("Case "+(i+1)+": "+result);
			
			
		}

		
	}
	
	static int factorial(int n)
	{
		int result=1;
//		while(n>0)
//		{
//			result=result*n;
//			n--;
//		}
		for(int i=1; i<=n; i++)
		{
			result=((result%1000003)*(i%1000003)%1000003);
		}
		return result;
	}

}
