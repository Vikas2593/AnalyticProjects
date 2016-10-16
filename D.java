package hitesh;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Container;

import javax.swing.JSeparator;


public class D extends JFrame {
	
	private JLabel item1;
	private JSeparator item2;
	private JRadioButton item3;
	private JLabel item4;
	private JRadioButton RadioButtonUnlock;
	private JLabel item6;
	private JLabel item7;
	private JButton item8;
	private ButtonGroup group;
	private ImageIcon image1;
	private JLabel lbl1;
	private ImageIcon image2;
	private JLabel lbl2;
	
	public D(){
	
	super("TASK SELECTION");
	this.getContentPane().setBackground(Color.YELLOW);
	Container c = getContentPane();
	setLayout(new FlowLayout());
	Icon a = new ImageIcon(getClass().getResource("rsz_2arrow_right.png"));
	
	item1=new JLabel("Select A Task To Perform");
	item2 = new JSeparator();
	item3 = new JRadioButton("LOCK",false);
	item4 = new JLabel("Lets you lock the folder or file");
	RadioButtonUnlock = new JRadioButton("UNLOCK",false);
	item6 = new JLabel("Lets you unlock the folder or file");
	item7= new JLabel("To Continue Click Next");
	item8 = new JButton("Next",a);
	
	image1 = new ImageIcon(getClass().getResource("rsz_red_lock.png"));
	lbl1=new JLabel(image1);
	image2 = new ImageIcon(getClass().getResource("rsz_green_unlock.png"));
	lbl2=new JLabel(image2);
	
	Font myfont=new Font("Serif", Font.ITALIC | Font.BOLD |Font.ROMAN_BASELINE,26);
	Font newFont1= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE); 
	Font newFont2 = myfont.deriveFont(Font.BOLD,11);
	Font newFont3= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE+Font.BOLD,14);
	
	c.setLayout(null);
	
	
	group = new ButtonGroup();
	group.add(item3);
	group.add(RadioButtonUnlock);
	
	
	c.add(item1);
	item1.setBounds(100,20,500,30);
	item1.setFont(newFont1);
	
	c.add(item2);
	item2.setBounds(0,75,500,30);
	item2.setBackground(Color.BLACK);
	
	
	c.add(item3);
	item3.setBounds(40,125,90,20);
	item3.setBackground(Color.YELLOW);
	item3.addItemListener(new ItemListener(){

		public void itemStateChanged(ItemEvent e) {
			
			item8.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					B bb=new B();
					bb.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					bb.setSize(500,400);
					bb.setVisible(true);
					
					
				}
				
			});
			
		
		}
		
	});

	
	
	c.add(item4);
	item4.setBounds(50,140,250,30);
	item4.setFont(newFont2);
	
	c.add(RadioButtonUnlock);
	RadioButtonUnlock.setBounds(40,200,90,20);
	RadioButtonUnlock.setBackground(Color.YELLOW);
	RadioButtonUnlock.addItemListener(new ItemListener(){

		public void itemStateChanged(ItemEvent ae) {
			
			item8.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent ae) {
					E ee=new E();
					ee.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					ee.setSize(500,400);
					ee.setVisible(true);
					item8.setBackground(Color.RED);
					
				}
				
			});
			
		}
		
	});

	
	
	c.add(item6);
	item6.setBounds(50,215,250,30);
	item6.setFont(newFont2);
	
	c.add(item7);
	item7.setBounds(150,285,150,30);
	item7.setFont(newFont3);
	
	c.add(item8);
	item8.setBounds(175,325,100,20);
	
	c.add(lbl1);
	lbl1.setBounds(250,125,90,35);
	
	c.add(lbl2);
	lbl2.setBounds(248,200,90,35);
}


}