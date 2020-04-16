import java.util.Scanner;

class codeForces_1 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n,t,a,b;
		
		t=in.nextInt();
		for(int i=0; i<t; i++)
		{
			n=in.nextInt();

			if(n>2)
			{
			  a=n/2+1;	
			  b=n-a;
			  System.out.println(b);
				
				
			}
			else
			  System.out.println(0);

			
			
		}
 
	}

}
