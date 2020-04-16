import javax.swing.JOptionPane;

public class Gui2 {

	public static void main(String[] args) {
 
		String name= JOptionPane.showInputDialog("enter your name please");
		             JOptionPane.showMessageDialog(null, "Welcome to swing "+name, "kidding",3);
		
        String name1= JOptionPane.showInputDialog("enter your first name again","name");	// 2nd parameter for inside the box message	
		              JOptionPane.showMessageDialog(null, "Welcome to swing "+name1, "kidding",3);
		              
		String name2= JOptionPane.showInputDialog(null,"enter your last name again2","this is title",1);
		
		String namee=name1+" "+name2; // for space
		              JOptionPane.showMessageDialog(null, "your full name is : "+namee );
		   
		              
		              
		              
	     int choise = JOptionPane.showConfirmDialog(null,"do you want to leave...?","title",JOptionPane.YES_NO_CANCEL_OPTION);
	     
	     if(choise == JOptionPane.YES_OPTION)
	     {
	    	 System.exit(0);
	    	 JOptionPane.showMessageDialog(null,"you choose \"yes\" option. ");
	    	
	     }
	     else if(choise == JOptionPane.NO_OPTION)
	     {
	    	 JOptionPane.showMessageDialog(null,"you choose \"no\" option. ");

	     }
	     else
	     
	    	 JOptionPane.showMessageDialog(null,"you choose \"cancle\" option. ");

	     

	}

}
