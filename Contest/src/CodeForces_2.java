import java.util.Scanner;

public class CodeForces_2 {

	public static void main(String[] args) {
 Scanner in =new Scanner(System.in);
 
 int t;
 int[][]arr=new int[9][9];
 t=in.nextInt();
 String s1,s2,s3,s4,s5,s6,s7,s8,s9;
 
 for(int i=0; i<t; i++)
	{
		
	 
	 s1=in.next();
	 s2=in.next();
	 s3=in.next();
	 s4=in.next();
	 s5=in.next();
	 s6=in.next();
	 s7=in.next();
	 s8=in.next();
	 s9=in.next();
	 

	  

	 for(int k=0; k<9; k++)
	 {
		 arr[k][0]=s1.charAt(k)- '0';

	 }
	 for(int k=0; k<9; k++)
	 {
		 arr[k][1]=s2.charAt(k)- '0';

	 }
	 for(int k=0; k<9; k++)
	 {
		 arr[k][2]=s3.charAt(k)- '0';

	 }
	 for(int k=3; k<9; k++)
	 {
		 arr[k][0]=s4.charAt(k)- '0';

	 }
	 for(int k=4; k<9; k++)
	 {
		 arr[k][0]=s5.charAt(k)- '0';

	 }
	 for(int k=5; k<9; k++)
	 {
		 arr[k][0]=s6.charAt(k)- '0';

	 }
	 for(int k=6; k<9; k++)
	 {
		 arr[k][0]=s7.charAt(k)- '0';

	 }
	 for(int k=7; k<9; k++)
	 {
		 arr[k][0]=s8.charAt(k)- '0';

	 }
	 for(int k=8; k<9; k++)
	 {
		 arr[k][0]=s9.charAt(k)- '0';

	 }
	 
 
	 
	 if(arr[0][0]!=1)
	 {
		 arr[0][0]=1;
	 }
	 else 
	 {
		
		 arr[0][0]=2;
	 }
	 
	 
	 
	 
	 if(arr[3][0]!=1)
	 {
		 arr[3][0]=1;
	 }
	 else 
	 {
		
		 arr[3][0]=2;
	 }
	 
	 
	 
	 
	 if(arr[6][0]!=1)
	 {
		 arr[6][0]=1;
	 }
	 else 
	 {
		
		 arr[6][0]=2;
	 }
	 
	 
	 
	 
	 
	 
	 if(arr[0][3]!=1)
	 {
		 arr[0][3]=1;
	 }
	 else 
	 {
		
		 arr[0][3]=2;
	 }
	 
	 
	 
	 
	 
	 
	 if(arr[3][3]!=1)
	 {
		 arr[3][3]=1;
	 }
	 else 
	 {
		
		 arr[3][3]=2;
	 }
	 
	 
	 
	 
	 
	 
	 if(arr[6][3]!=1)
	 {
		 arr[6][3]=1;
	 }
	 else 
	 {
		
		 arr[6][3]=2;
	 }
	 
	 
	 
	 
	 
	 
	 if(arr[0][6]!=1)
	 {
		 arr[0][6]=1;
	 }
	 else 
	 {
		
		 arr[0][6]=2;
	 }
	 
	 
	 
	 
	 
	 
	 if(arr[3][6]!=1)
	 {
		 arr[3][6]=1;
	 }
	 else 
	 {
		
		 arr[3][6]=2;
	 }
	 
	 
	 
	 
	 
	 
	 if(arr[6][6]!=1)
	 {
		 arr[6][6]=1;
	 }
	 else 
	 {
		
		 arr[6][6]=2;
	 }
	 
	 
	 
	 for(int l=0; l<9; l++)
	 {
		 for(int m=0; m<9; m++)
		 {
			System.out.print(arr[m][l]); 
		 } 
			System.out.println(""); 

	 }
	}

}
}