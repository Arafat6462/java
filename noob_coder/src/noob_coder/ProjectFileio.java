package noob_coder;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class ProjectFileio {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		
		// create a folder
		File folder=new File("Login Folder");
		folder.mkdir();
 
				
		//Login folder location
		String FolderLocation=folder.getAbsolutePath();
 
		
		
		//create file in the folder
		File file=new File(FolderLocation+"/Login_info.txt");
		
 		try
		{
			file.createNewFile();
			 
		}
		catch(Exception e)
		{
			System.out.println("file create failed ..!! "+e);
			
		}
 		String Login_infoLocation=file.getAbsolutePath();
 	
		
		
		
		
		
		// write on the file
		try
		{

			Formatter formatter=new Formatter(Login_infoLocation);
			
			System.out.println("Enter yout name please.. : ");
			String name=in.next();
			
			formatter.format("%s %s \n",name, "admin");
			formatter.close();

		}
		
		catch(Exception e)
		{
			System.out.println("file write failed ..!! "+e);

		}
		
		
		
		
		//read the file	
		String name="",password="";
		try
		{
			File readfile =new File(Login_infoLocation);
			
			Scanner input = new Scanner(file);
			  name=input.next();			
			  password=input.next();
			
			input.close();

		}
		catch( Exception e)
		{
			System.out.println("file read failed ..!! "+e);

		}
		
		
		System.out.println("name is : "+name);
		System.out.println("password is : "+password);

		
		
	}

}
