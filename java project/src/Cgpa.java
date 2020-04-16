
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
public class Cgpa {
	
	public static void main(String[] args)
	{
		
  
  
    // Login check
    LoginFileio login=new LoginFileio();
    String password=login.Login();
    
    if(password.equals(login.userGivenPassword().toLowerCase()))
    {
    	
    	 
    	
    	 // reference variable for abstraction
        FunctionOverriding1 overload;
        overload=new FunctionOverriding2();
        overload.FunctionOverriding();
    	
    	
    	
        // main calculation of the program
    	Current obj1=new Current();
        obj1.currentsemesterGpa();
          
        
        
        // re-run the program
        while(recalculationLoop()!=0)
            {
            obj1.currentsemesterGpa();
      	    }
    }
    else
    {
    	prln("you enter a wrong password : ");
    	//login.userGivenPassword();
    	
    }
    
   
    
  }
	 


	   //  again run the program
		private static int recalculationLoop() {
			Scanner in=new Scanner(System.in);
			prln("\n\n\tpress 1 to calculate again\n\n\tpress 0 to exit\n\n");
			int a=in.nextInt();
 		    return a;
	     }





		// print method
	    static void prln(Object  a)
	    {
		System.out.print(a);
		}
	
	
	
	
	//print new line method
	static void prln2(Object  a)
    {
	System.out.println(a);
	
	}
}



            






/////////////////////////////////////////////////////////    File I_O     ///////////////////////////////////////////////////////

 
     class LoginFileio {
	public  String name="",password="";

	public String Login( )
	
	{
		
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
			
			System.out.print("Enter yout name please..  : ");
			String name=in.next();
			
			formatter.format("%s %s \n",name, "admin");
			formatter.close();

		}
		
		catch(Exception e)
		{
			System.out.println("file write failed ..!! "+e);

		}
		
		
		
		
		//read the file	
		
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
		
		
//		System.out.println("name is : "+name);
//		System.out.println("password is : "+password);

		return password;
		
	}
	
	
	// get user name
	public String getUsername() 
	{
	     //String usernameString;
	    // usernameString=super.name;
	  // System.out.println("name is in function" +name);
		return this.name;
	}
	
	
	//user given password method
	String userGivenPassword()
	{
		Scanner in=new Scanner(System.in);

		System.out.print("Enter password as 'admin' : ");
		String pass=in.next();
		return pass;
	}

}

 

 










////////////////////////////////////////////////    O_O_P     //////////////////////////////



      
          // method overriding    
         // runtime Polymorphism
        // abstraction
       // abstraction, so you can't make any object of the class FunctionOverriding1
      // no method body in abstract class
     // must be override the abstract method

      abstract  class FunctionOverriding1
       {	 
     	   
	    abstract   void FunctionOverriding();
 
       }
	       




           class FunctionOverriding2 extends FunctionOverriding1
           {
        	   void FunctionOverriding()
			{
        		   System.out.println("\t\t#####################################");
		
			}
           }
          // end of runtime Polymorphism , abstraction & method overriding 
        


           
           
                // interface
               // every variable in interface or abstract class are final.
              // compiler read variable as public static final
             // in interface, every methods are abstract
            // compiler read interface method as public abstract
           // last but not the least, it is a dummy interface.     :)   :)
           interface Interface
           {
        	  int i=10;
        	   
        	   
        	   void print();
        	   void dummyMethod();     	   
        	   public abstract void Null();
        	   
           }
           
           
           
           
              // class can extends a class
             // interface can extends a interface
            // class can implements interface
           // must have to implement all the method of interface in class 
           class ImplementInterface implements Interface
           {
        	   
        	   
        	   public void print()
        	   {
            	   System.out.println("override the interface print method");
               }
        	   
        	   
        	   public void dummyMethod() {}
        	    
        	   
        	   public void Null(){}
        	   
           }
           // end of dummy interface code

          
           
           
           
           
           
           
           
           
           
///////////////////////////////////////////////    O_O_P  &   GPA   ////////////////////////////

           
             //student previous semester total gpa
            // abstraction, so you can't make any object of the class FunctionOverriding1
            abstract class Previous  
           { 
        	   Scanner in =new Scanner (System.in);

        	   int cre;
        	   double cg;
        	   private double currentGpa;  //Encapsulation
	
	
        	   
        	   // this Constructor will call when create current class object.
        	  // because current class inherit previous class
        	   Previous()
        	   {
        		   Cgpa.prln("\t\t####  WELCOME TO CGPA CALCULATOR ####\n");
        		   System.out.print("\t\t#####################################\n\n\n");

        	   }
	    
	
	
	
       // set current result method
	   void cgpa(int currentGpa)
	{
		   
		   try
		   {
			    Cgpa.prln("enter the number of credit you completed : ");
				cre=in.nextInt();
				Cgpa.prln("enter your current cgpa : ");
				cg=in.nextFloat();
				
				 this.currentGpa=cre*cg;
		   }
		   catch(Exception e)
		   {
		   	System.out.println(e);
		   	

		   }

		
 		
	}
	   
	   
	   
	   
	   
	     
	     // compile time Polymorphism
 	    // get current result method
	   // method over loading 1
	  // get Encapsulated value
	   
	   double getcurrentGpa(int a)
	   {
		   return currentGpa;
	   }
	  
	   
	 
	   // method over loading 2
 	   double getcurrentGpa(int a, int b)
	   {
		   return 0;
	   }
	  // end of compile time Polymorphism
}





            
            
            
            
            
            
            
            
/////////////////////////////////////////////////////////    main calculation     ///////////////////////////////////////////////////////
         
            
            
            
           // student current semester result extend previous class
           class Current extends Previous
           { 
        	   Scanner in =new Scanner (System.in);
	
	
  
	
    void currentsemesterGpa()
    {
    	
    
     // super and this keyword
     super.cgpa(0);
     double currentGpa=super.getcurrentGpa(0); //// compile time Polymorphism


     
     
     
        int course=0;
		 
	    try
	    {
	    	Cgpa.prln("\n\nenter the number of course taken in this semester : ");
		    course=in.nextInt();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);

	    } 
	
	 

    String[] courseName=new String[course];
	String[] grade=new String[course];
	int[] credit=new int[course];
 	    	

	
	     // if you don't take any course then u can't continue the program
	     String retake="";
		 if(course>0)
		 {
			 Cgpa.prln("\n\ndo you hava any re-take course in this semester..[yes/no] :");
		     retake=in.next();
		 }
		
		
		
		
		
		// String check="yes";
		int re=0;

		
		//retake=retake.toUpperCase();
		if(retake.toUpperCase().equals("YES"))
		{
 			


		    try
		    {
		    	Cgpa.prln("how many re-take course you have....: ");
			     re=in.nextInt();
			    
			    String []retakeGrade=new String[re];
			    
			    
			    for(int j=0; j<re; j++)
			    {
			    	Cgpa.prln("\n\nenter the name of the re-take course "+(j+1)+" : ");
					courseName[j]=in.next();
					
					Cgpa.prln("how many credit have of the re-take course "+(j+1)+" : ");
					credit[j]=in.nextInt();
					
					Cgpa.prln("enter the grade of the re-take course "+(j+1)+" : ");
					grade[j]=in.next();
					
					Cgpa.prln("previous grade of re-take course "+(j+1)+" : ");
					retakeGrade[j]=in.next();
			    }
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);

		    } 
		}
		
		

		
		
		
		for(int i=re; i<course; i++)
		{
			try
		    {
				Cgpa.prln("\n\nenter the name of the course "+(i+1)+" : ");
				courseName[i]=in.next();
				

				Cgpa.prln("how many credit have of the course "+(i+1)+" : ");
				credit[i]=in.nextInt();
				
				Cgpa.prln("enter the grade of the course "+(i+1)+" : ");
				grade[i]=in.next();
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);

		    } 

			
 
			
		}

 
	double gpa=0,totalgpa=0,totalcgpa=0;
	int totalcredit=0;
	double[] gradepoint=new double[course];
	
	  
  

		for(int i=0; i<course; i++)
		{
 			if(grade[i].toUpperCase().equals ("A+"))
			 gradepoint[i]=4.00;
			
			else if (grade[i].equals("a") || grade[i].equals ("A"))
				 gradepoint[i]=3.75;
			
			else if (grade[i].equals("b+") || grade[i].equals ("B+"))
				 gradepoint[i]=3.50;
			
			else if (grade[i].equals("b") || grade[i].equals ("B"))
				 gradepoint[i]=3.25;
			
			else if (grade[i].equals("c+") || grade[i].equals ("C+"))
				 gradepoint[i]=3.00;
			
			else if (grade[i].equals("c") || grade[i].equals ("C"))
				 gradepoint[i]=2.75;
			
			else if (grade[i].equals("d+") || grade[i].equals ("D+"))
				 gradepoint[i]=2.50;
			
			else if (grade[i].equals("d") || grade[i].equals ("D"))
				 gradepoint[i]=2.25;
			
			else if (grade[i].equals("f") || grade[i].equals ("F"))
				 gradepoint[i]=0.00;
		}
		
	
		int back_upcredit=0; /// for current semester 
		double back_upgpa=0; /// for current semester 
		double back_upcgpa=0; // for current semester 

		
		for(int j=0; j<course; j++)
		{
			back_upgpa+=(gradepoint[j]*credit[j]);    
			totalcredit+=credit[j];
		}
		
		  back_upcredit=totalcredit; /// for current semester 
		
		
		
		
		for(int j=re; j<course; j++)  //re-take gpa will count later
		{
			gpa+=(gradepoint[j]*credit[j]);
 		}
		
		
		 
 		
	    // currentGpa= cgpa.currentGpa;
        totalgpa=currentGpa+gpa;
	    totalcredit=cre+totalcredit;
	    
	   
	     
	    
	    // re-take  
	    int retakecredit=0;
	    double retakecreditgpa=0;

	    
	   
	    
	    //total re-take credit
	    for(int i=0; i<re; i++)   
	    {
	    	retakecredit+=credit[i];
	    }
	    
	    
	    
	    
	    double []retakeGpa=new double[re];

	    
	    
        // re-take gpa array
		for(int i=0; i<re; i++)  
		{
 			 
			 if (grade[i].equals("d") || grade[i].equals("D"))
				 retakeGpa[i]=2.25;
			
			else if (grade[i].equals("f") || grade[i].equals("F"))
				retakeGpa[i]=0.00;
		}
		
		
		
		
		// total re-take credit gpa after - the previous 
		for(int i=0; i<re; i++)  
		{
 			 
			 if (retakeGpa[i]<=gradepoint[i])
			 {
				 retakecreditgpa+=(gradepoint[i]-retakeGpa[i])*credit[i];		
			 
			 }
			 else
				 retakecreditgpa+=(retakeGpa[i]-gradepoint[i])*credit[i];
		}
		
		
		
		//back-up / current semester cgpa
		back_upcgpa=back_upgpa/back_upcredit;

		
		
		
		
		// TOTAL CGPA		
		totalcredit-= retakecredit;
		totalgpa+=retakecreditgpa;
	    
	    
	    
	    totalcgpa=totalgpa/totalcredit;
	  //  System.out.println("\n\nYOUR TOTAL CGPA IS : "+totalcgpa);
	
	   
	   
	    
	    
	   //design
	   
	   
	   
	    
   Cgpa.prln2("\n\n\n\t ----------------------------------------------------------------------------- ");
	    Cgpa.prln2("\t|             |            |           |                                     | ");
	    Cgpa.prln2("\t|   CREDIT    |    GRADE   |    GPA    |     COURSE-NAME                     | ");
	    Cgpa.prln2("\t|             |            |           |                                     | ");
	    Cgpa.prln2("\t| ------------|------------|-----------|-------------------------------------| ");


  
	   for(int i=0; i<course; i++)
	   {
	    Cgpa.prln2("\t|             |            |           |                                     | ");
	    Cgpa.prln2("\t|      "+credit[i]+"      |      "+grade[i].toUpperCase()+"         "+gradepoint[i]+"    |     "+courseName[i].toUpperCase());
	    Cgpa.prln2("\t|             |            |           |                                     | ");
	    Cgpa.prln2("\t| ------------|------------|-----------|-------------------------------------| ");

 
		   
	   }
	  // LoginFileio name3=new LoginFileio();
	   
	//   Cgpa.prln2("\n\n\n\t              HELLO   "+name3.getUsername());

	   
	   
	   Cgpa.prln2("\n\n\t ----------------------------------------------------------------------------- ");
	          Cgpa.prln2("\t|                                                                            | ");
	  System.out.println("\t|         YOUR CURRENT SEMESTER CGPA IS :  "+back_upcgpa+"                 ");
              Cgpa.prln2("\t|                                                                            | ");
	          Cgpa.prln2("\t|----------------------------------------------------------------------------| ");
	          Cgpa.prln2("\t|                                                                            | ");
	  System.out.println("\t|         YOUR TOTAL CGPA IS :  "+totalcgpa+"                             ");
              Cgpa.prln2("\t|                                                                            | ");
              Cgpa.prln2("\t|----------------------------------------------------------------------------| ");

 

	   // Cgpa.main(String[] args);
          
		
	}
 


}


















