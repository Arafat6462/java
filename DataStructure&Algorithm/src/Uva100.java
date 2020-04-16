import java.util.Scanner;
  class Uva100 {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true)  // for infinite input
		{
			
			int a=in.nextInt();
			int b=in.nextInt();
			
			int[] arr1=new int [a];
			int[] arr2=new int [b];
			
			int max1=1,max2=1;
			
			
			for(int i=0; i<a; i++) // for each pair of a
			{
				int k=i+1,count=1;
				
				
				while(k != 1)
				{
					
					if(k%2 !=0)
					{
						k=(k*3)+1;
					}
					else
					{
						k/=2;
					}
						
					
					count++;
				}
				
				
				arr1[i]=count;
			  	
			}
			
			for(int i=0; i<a; i++)  // max value in array for a
			{
				if(arr1[i]>max1)
				{
					max1=arr1[i];
				}
 
			}
			
			
			
			
			
			/// extra
			
			
//			
//			for(int i=0; i<a; i++)  // max value in array for a
//			{
//				System.out.print(arr1[i]+" "); 
// 
//			}
//			System.out.print("\nmax value is : "+max1); 
//
//			
//			
			
			
			
			
			
			
			
			
			
			
			for(int i=0; i<b; i++) // for each pair of b
			{
				int k=i+1,count=1;
				
				
				while(k != 1)
				{
					
					if(k%2 !=0)
					{
						k=(k*3)+1;
					}
					else
					{
						k/=2;
					}
						
					
					count++;
				}
				
				
				arr2[i]=count;
			  	
			}
			
			for(int i=0; i<b; i++)  // max value in array for b
			{
				if(arr2[i]>max2)
				{
					max2=arr2[i];
				}
 
			}
			
			
			
			
			
			
			if(max1<max2)
			{
				System.out.println(a+" "+b+" "+ max2);
			}
			else
				System.out.println(a+" "+b+" "+ max1);

				
			
			
			
			

		}
 
	}

}
