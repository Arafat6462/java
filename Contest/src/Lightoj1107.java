import java.util.Scanner;

  class Lightoj1107 {

	public static void main(String[] args) {
  
		Scanner in=new Scanner(System.in);
		int t,x1,x2,y1,y2,m,x=0,y =0;
		
		t=in.nextInt();
		for (int i=0; i<t; i++)
		{
			
			x1=in.nextInt();
			y1=in.nextInt();
			x2=in.nextInt();
			y2=in.nextInt();
			
			m=in.nextInt();
			
//			int[] x=new int[m];
//			int[] y=new int[m];
			



//			for(int j=0; j<m; j++)
//			{
//				x=in.nextInt();
//				y=in.nextInt();
//
//			}
//			
			
			System.out.println("Case "+(i+1)+": ");

			
			for(int k=0; k<m; k++)
			{
				x=in.nextInt();
				y=in.nextInt();

				if((x1<x && x<x2) && (y1<y && y<y2))
				{
					System.out.print("Yes\n");

				}
				else {
					System.out.print("No\n");

				}
			}
			
			
			
		}
	}

}
