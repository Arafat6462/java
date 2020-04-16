import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
  class Gui1 {
	public static void main(String [] args)
	{
		
		JOptionPane.showMessageDialog(null, "hello arafat ");
		JOptionPane.showMessageDialog(null, "it is a 4 parameterr showMessageDialog", "warning", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "it is 4th  ", "warning",  -1); //-1,0,1,2,3		
		
		ImageIcon icon=new ImageIcon("c.png");
		JOptionPane.showMessageDialog(null,"it is a 5 parameterr showMessageDialog", "title", 1,icon);

		
		
	}

}
