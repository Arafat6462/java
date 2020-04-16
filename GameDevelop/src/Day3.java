import java.util.Scanner; // Scanner package 

public class Day3 {
	
	
	static Scanner input=new Scanner(System.in); // "input" is a object of Scanner for take input
	                                             // "System.in" refers take input from System

	public static void main(String[] args) {
 
		String name;
		name=new String();  // u can use ++++   String name=new String("Arafat Hossain ");
		
		prln("please write yout name ...");
		name= input.nextLine(); // take input from next line ;
		
		System.out.println("previous method :");
		System.out.println("name is : "+name+"\n");
		
		prln("this is out new method: "); // pass a String as parameter
		pr(name);  // pass a String type variable as parameter
		prln("\n\nnumber of character in your name is : "+name.length());  // ".length()" is for length
		
		if(name.length()>15)
		{
			prln("your name is too long");
		}
		else if(name.length()<3)   // else if work when previous if is false
		{
			prln("your name is too short");
		}
		 if(name.length()<15 && name.length()>3)
		{
			prln("your name is perfect");
			
			switch(name.length())
			{
			case 7:
				prln("you have a name of character 7");
				break;
			case 8:
				prln("you have a name of character 8");
				break;
			case 5:
				prln("you have a name of character 5");
					break;
			case 6:
				prln("you have a name of character 6");
					break;
			case 13:
				prln("you have a name of character 13");
					break;
			case 3:
				prln("you have a name of character 3");
					break;
			case 2:
				prln("you have a name of character 12");
					break;
					
			default:
				prln("your name is ok ");
				
			}
		}
		 
		 
		 int a=3,b=12;
		 prln("A :"+a+"\nB :"+b);
		 
//		 b++;    good practice
//		 a+=b;
		 
		 a+=b++; // b++ mean initially b=12 & b work with 12 value for first execution.
		         // after one execution finish, then b will increase by 1 for every execution.
		 prln("\nA :"+a+"\nB :"+b);
		 
		 
		 
		 
		 int c=3,d=12;
		 prln("\nC :"+c+"\nD :"+d);
		 
		 
//		 ++d;    good practice
//		 c+=d;
		 
		 c+=++d; // ++d mean initially d=12 &  for ++d, immediately d will increase by 1 before any execution
 		 prln("\nC :"+c+"\nD :"+d);
		 
		
		//array
		
		int [][] twoDArray=new int [2][4]; // row * column
		
		//   1 3 4 6
	   //    4 5 6 7 
 		
		twoDArray[0][0]=1;
		twoDArray[0][1]=3;
		twoDArray[0][2]=4;
		twoDArray[0][3]=6;

		twoDArray[1][0]=4;
		twoDArray[1][1]=5;
		twoDArray[1][2]=6;
		twoDArray[1][3]=7;
		
		
		twoDArray[1][3]+=twoDArray[0][2]+twoDArray[0][3]; // twoDArray[1][3] = twoDArray[1][3] + (twoDArray[0][2]+twoDArray[0][3]);
		
		prln("at the point of array [1][3] valur is : "+twoDArray[1][3]);
 
 	
		
	}
	
	 
	static void prln(Object anyobject) // here any object is a Object type variable that can take any type variable
	                                   //  like int,float,string,,,, etc
	{ 
		System.out.println(anyobject);
	}
	
	
	static void pr(Object anyobject)   // for use Object type parameter variable, we can use this method for any type of input :)
	{ 
		System.out.print(anyobject);
	}
	
	
	
	
}

