
import java.util.Scanner;

public class Hello {
	
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
       System.out.println("Enter your name please...?\n");
       
       String name1=input.nextLine();
       String name2=input.next();
       float  name3=input.nextFloat();
       double name4=input.nextDouble();
       int    name5=input.nextInt();
     //float  name6=input.nextDouble(); double is bigger than float. so float can't carry double
     //double name7=input.nextFloat(); // to change float to double it will work but it loose something like (float 5.1=double 5.09999


       System.out.println("hello "+3456);
	}

}

// for string use next or nextLine
// for integer use nextInt
// for double use nextDouble
// for float use nextFloat

//