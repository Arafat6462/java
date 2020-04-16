
public class Exception1 {

	public static void main(String[] args) {
 
		b(); 
		

	}
	static int a=0;
	
	
	static  void a()
	{
		System.out.println(a);
		b();
	}
	
	
	  static void b( )
	{
		System.out.println(a);
		a();

	
	}


}
