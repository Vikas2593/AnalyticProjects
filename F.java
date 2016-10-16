package hitesh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class F extends JFrame{

	private JLabel item1;
	private JSeparator item2;
	private JLabel item3;
	private JLabel item4;
	private JScrollPane scrollpane;
	private ImageIcon image;
	private JLabel lbl;
	
	public F(){
		super("ABOUT");
		this.getContentPane().setBackground(Color.YELLOW);
		Container c = getContentPane();
		setLayout(new FlowLayout());
		
		item1=new JLabel("About The Application");
		item2=new JSeparator();
		item3 = new JLabel("<html>Folder Lock is a full suite solution for all your data security needs. It lets you keep your personal files protected from unauthorized access in both PC and portable drives.</html>");
		item4 = new JLabel("<html>Application Developed By:<br> Vinay Sehrawat<br>Nikhil Dahiya<br>Hitesh Ahuja<br>Vikas</html>");
		image = new ImageIcon(getClass().getResource("rsz_red_lock (2).png"));
		lbl=new JLabel(image);
		
		Font myfont=new Font("Serif", Font.ITALIC | Font.BOLD |Font.ROMAN_BASELINE,26);
		Font newFont1= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE); 
		Font newFont2 = myfont.deriveFont(Font.BOLD,15);
		Font newFont3= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE+Font.BOLD,15);

		
		c.setLayout(null);
		
		c.add(item1);
		item1.setBounds(150,20,500,30);
		item1.setFont(newFont1);
		
		c.add(item2);
		item2.setBounds(0,75,500,30);
		item2.setBackground(Color.BLACK);
		
		c.add(item3);
		item3.setBounds(30,85,450,55);
        item3.setFont(newFont3);
	
        c.add(lbl);
        lbl.setBounds(145,125,150,150);
	
        c.add(item4);
        item4.setBounds(30,235,450,100);
        item4.setFont(newFont3);
	}
	
}