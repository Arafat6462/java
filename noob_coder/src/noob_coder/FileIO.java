
package noob_coder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileIO { 
	public static void main(String[] args)
	{
	
	File folder=new File("student");
	folder.mkdir();  // create folder
	
	String folderLocation=folder.getAbsolutePath();
	System.out.println(folderLocation);    // location
	System.out.println(folder.getName());    // folder name
	
	
	
	
	File folder1=new File("/home/arafat/eclipse-workspace/noob_coder/student/new student");
	folder1.mkdir();  // create another folder with in the student
	

	String folderLocation1=folder1.getAbsolutePath();
	System.out.println(folderLocation1);    // location
	System.out.println(folder1.getName());    // folder name
	
	
	// create file in new student
	
	File file=new File(folderLocation1+"/student.txt");
	File file1=new File("/home/arafat/eclipse-workspace/noob_coder/student/new student/teacher.txt");

	
	
	try {
		file.createNewFile();
		file1.createNewFile();
		//System.out.println("file are created");  
        }
	
	catch(Exception e)
	{
		System.out.println( e);    

	}
	
	if(file.exists())
	{
		System.out.println("file exists ");    
	
	}
	
//	
//	folder1.delete();
//	folder.delete();
//	 
//	
	
	
	//write on the file
	
	
	
	try {
		Formatter formatter=new Formatter("/home/arafat/eclipse-workspace/noob_coder/student/new student/student.txt");
		
		formatter.format("%s %s \n","arafat", "18-37576-1"  );
		
		//multiple student
		
		Scanner input=new Scanner(System.in);
		System.out.println("how many student..?");
		int n=input.nextInt();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("enter student name and id ");
			
		     String name=input.next();
		     String id=input.next();
			formatter.format("%s %s \n",name, id  );



			
		}
		formatter.close();

		
	}
	
	
	
	
	catch(FileNotFoundException e) {
		System.out.println(e);    

		
	}
	
	
	///read file
	
	
	try {
		File fetfile=new File("/home/arafat/eclipse-workspace/noob_coder/student/new student/student.txt");
				
		Scanner scanner=new Scanner(file);
		
		while(scanner.hasNext())
		{
			String name1=scanner.next();
			String id1=scanner.next();
			System.out.println("name "+name1+"\tid "+id1);    


		}
		scanner.close();
	}
	
	catch(Exception e)
	{
		System.out.println(e);    

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
