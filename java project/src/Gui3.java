import javax.swing.JFrame;

public class Gui3 extends JFrame { // inherit the JFrame and make Gui3 object
	public static void main(String [] args)
	{
		
		
		JFrame frame = new JFrame();
 		
		frame.setVisible(true); // appear the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close after cancel  the program
		
	  //frame.setSize(400,300);
		
      //frame.setLocationRelativeTo(null);
	  //frame.setLocation(200,50);
		
		frame.setBounds(200,50,400,300); // location + size 
		
		frame.setTitle("frame");
		frame.setResizable(false);
	}

}
