package noob_coder;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Labio1 {
	public static void main(String[] args)
	{
		
		 

		//create file
		
		File filee=new File("/18-37576-1.txt");

		try {
			filee.createNewFile();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		//write on the file
		
		try {
			Formatter form=new Formatter("/18-37576-1.txt");
			form.format("%s %S %S", "Arafat","18-37576-1","cse");
			form.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);

		}
		
		
		//read file
		
		try {			 
			File file3=new File("/18-37576-1.txt" );

			Scanner in=new Scanner(file);
			


			while(in.hasNext())
			{
				String name3=in.next();
				String id3=in.next();
				String dep3=in.next();
				System.out.println("name is "+name3+"\nid is "+id3+"\ndep is "+dep3);

			}
			in.close();
		 

		}
		
		catch(Exception e)
		{
			System.out.println(e);

		}
		
//		try {
//			File fetfile=new File("/home/arafat/eclipse-workspace/noob_coder/student/new student/student.txt");
		                      //   /home/arafat/eclipse-workspace/noob_coder/student
//					
//			Scanner scanner=new Scanner(file);
//			
//			while(scanner.hasNext())
//			{
//				String name1=scanner.next();
//				String id1=scanner.next();
//				System.out.println("name "+name1+"\tid "+id1);    
//
//
//			}
//			scanner.close();
//		}
//		
//		catch(Exception e)
//		{
//			System.out.println(e);    
//
//		}
		
		
		


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
