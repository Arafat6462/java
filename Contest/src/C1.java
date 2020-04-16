import java.util.Scanner;
  class C1 {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args)
	{
		int t=in.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int n=in.nextInt();
			int [] arr=new int[n];
			for(int j=0; j<n; j++)
			{
				arr[j]=in.nextInt();
			}
			
			
			for(int k=0; k<n; k++)
			{
				for(int l=1; l<n; l++)
				{
					if( arr[l]<arr[l-1])
					{
						int temp=arr[l];
						arr[l]=arr[l-1];
						arr[l-1]=temp;
						
					}
				}
			}

			 
			System.out.println("Case "+t+": "+arr[n-1]);
			 
			
			
			
			
			
		}
		
		
		
	}

}
