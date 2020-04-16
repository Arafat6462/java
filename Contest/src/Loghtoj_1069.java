import java.util.Scanner;

  class Loghtoj_1069 {
 	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		
		int testcase,left,diff,me,i,result;
		
		testcase=in.nextInt();
		for( i=0; i<testcase; i++)
		{
			
			me=in.nextInt();
			left=in.nextInt();
			
			if(me<=left)
			{
				
				 result=left*4+19;
				System.out.println("Case "+(i+1)+": "+result);

				
			}

			else
			{
				 result=(2*me-left)*4+19;
				System.out.println("Case "+(i+1)+": "+result);


			}
			
			
		}
 		
		
	}
	 

		 
}
