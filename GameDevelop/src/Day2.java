
public class Day2 {
	
	public static void main(String[] args)
	{
		char arr[]= {'a','b','c','6','3','4'};
		char[] arr1={'5','b','c','0','#'};
		
		int integer=34;
		final float flot=3; // final for fixed or constant the value. u can not change the value
		double doub=345.45;
		short shor=34;
		boolean bool=true;
		bool=4<3;
		bool=!boo(integer); // true became false for '!' sign.
		char cha='a';   // to print a character use single quotation ''
		char cha1='2'; // number or anything you can print as a string use ''
		
		int a=cha;      // int can print a character ascii value, here 'cha' is a character
		
		int b=cha1;     /*here cha1='2' but '2' is now a character  type value & to print a character
		                 as integer it will show the ascii of the value '2'   */
		
   //   int c=h;       int type variable can print a character ascii value but you can not initilize
  //                   a character direct to the int type variable.  first take character into a char type
 //                    variable then assign this variable into a int type 
		
		integer+=10; // integer = integer + 10
		integer/=4;  // integer= integer / 4
		integer%=2;  // integer= integer % 2 ,,,,, here % means divisor
 		

		
		System.out.println(bool);
		System.out.println(cha1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(integer);
		System.out.println(arr[1]);
		System.out.println(arr1[4]);

 	
	
	}
	
	
	
	static boolean boo(int a )
	{
		boolean b=a/2==17;   // 34/2==17 return true
		return b;
	}

}
