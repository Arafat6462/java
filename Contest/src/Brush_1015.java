import java.util.Scanner;

 class Brush_1015 {
 static Scanner in=new Scanner(System.in);
	public static void main(String[] args)
	{
		int testcase=in.nextInt();
		for(int i=0; i<testcase; i++)
		{
			int n=in.nextInt();
			int []a =new int[n];
			
			for(int j=0; j<n; j++)
			{
				a[j]=in.nextInt();
			}

			int sum=0;
			for(int k=0; k<n; k++)
			{
				
				if(a[k]>=0)
				{
					sum+=a[k];
				}
				
			}

			System.out.println("Case "+(i+1)+": "+sum);
			
			
			
			
			
			
		}
 
	}

}
