import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

 public class Gui5_JLabel extends JFrame  {
	 
	 
	 private Container c; // global variable for object
	 private JLabel userlabel,passlabel,imglabel;
	 private Font f;
	 private ImageIcon img;
	 
	 Gui5_JLabel()
	 {
		 Component();
	 }

	 
	public void Component()
	 {
		c=this.getContentPane(); 
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		
		
		f=new Font("arial",Font.BOLD,14);
		
		
		userlabel=new JLabel(); // j-label works for display text or image in frame
		userlabel.setText("enter you name please..");
		userlabel.setBounds(50,20,250,20); // location + size
		userlabel.setFont(f);
		userlabel.setForeground(Color.blue); // text color
		
		userlabel.setOpaque(true);                 // text background function enable
		userlabel.setBackground(Color.LIGHT_GRAY);// text background color
		
		userlabel.setToolTipText("hi..!!");
		c.add(userlabel);
		
		System.out.println(userlabel.getText());
		String s=userlabel.getToolTipText();
		System.out.println(s);

		
		
		
		passlabel=new JLabel("enter yout password.."+s);// alternative of "setText()" method
		passlabel.setBounds(50,40,250,20);
		passlabel.setFont(f);
		c.add(passlabel);
		
		
		
		img=new ImageIcon(getClass().getResource("c.png"));
		
		imglabel=new JLabel(img);
		imglabel.setBounds(350,100,img.getIconWidth(),img.getIconHeight());
		c.add(imglabel);
		
	 }
	 
	 
	 
	public static void main(String[] args) {
 
		Gui5_JLabel frame=new Gui5_JLabel();
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500, 300, 500, 300);
		frame.setTitle("Label demo");
		
	}

}
