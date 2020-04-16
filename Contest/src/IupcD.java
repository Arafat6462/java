import java.util.Scanner;
public class IupcD {
	
    static Scanner in=new Scanner(System.in);
 	public static void main(String[] args) {
		
		int n=in.nextInt();
		int m=in.nextInt();
 

		int x=n+m-1;
		 
			   n=x-n;
			   m=x-m;

				System.out.print(n+" "+m);
 			
		 
	}

}
