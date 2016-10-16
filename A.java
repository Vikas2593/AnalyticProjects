package hitesh;



import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;





public class A extends JFrame{
	
	
	private JButton item4;
	private JLabel item5;
	private JLabel item6;
	private JLabel lbl;
	private ImageIcon image;
	private JLabel item7;
	private JButton item8;
	private JSeparator horizontalseparator;
	
	public A(){
		
		super("FOLDER LOCK");
		this.getContentPane().setBackground(Color.YELLOW);
		Container c = getContentPane();
		setLayout(new FlowLayout());
		
		Icon a = new ImageIcon(getClass().getResource("rsz_2arrow_right.png"));
		Icon b = new ImageIcon(getClass().getResource("rsz_help.png"));
		
		
		item4= new JButton("Next",a);
		
		item5=new JLabel("WELCOME TO FOLDER LOCKER!");
		
		item5.setFont(item5.getFont().deriveFont((float) 26.0));
		
		item6=new JLabel("<html>This wizard will help you restrict access to a folder or a file that contain your sensitive private data.</html>");
		
		item6.setFont(item6.getFont().deriveFont((float) 12.0));
		
		item7=new JLabel("To Continue Click Next");
		
		image = new ImageIcon(getClass().getResource("lock_yellow.png"));
		lbl=new JLabel(image);
		
		item8 = new JButton("About",b);
		
		horizontalseparator = new JSeparator();
		
		Font myfont=new Font("Serif", Font.ITALIC | Font.BOLD |Font.ROMAN_BASELINE,26);
		Font newFont1= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE); 
		Font newFont2 = myfont.deriveFont(Font.BOLD,15);
		Font newFont3= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE+Font.BOLD,14);
		
		c.setLayout(null);
	
		item4.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
		
			
			D dd=new D();
			dd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			dd.setSize(500,400);
			dd.setVisible(true);
			 
			item4.setBackground(Color.RED);	
			
			try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Windows".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
			
			}
			
			
		
		});
		item4.setBackground(Color.WHITE);
		c.add(item4);
		item4.setBounds(275,300,100,20);
		
		c.add(item5);
		item5.setBounds(40,20,500,30);
		item5.setFont(newFont1);
		
		c.add(item6);
		item6.setBounds(80,40,200,200);
		item6.setFont(newFont2);
		
		c.add(lbl);
		lbl.setBounds(200, 65, 300, 150);
	
		c.add(item7);
		item7.setBounds(155,230,150,30);	
		item7.setFont(newFont3);

		item8.setBackground(Color.WHITE);
		c.add(item8);
		item8.setBounds(120, 300, 100, 20);
		item8.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				F ff= new F();	
			    ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ff.setSize(500,400);
				ff.setVisible(true);	
				item8.setBackground(Color.RED);
			}
			
		});
		
		c.add(horizontalseparator);
		horizontalseparator.setBounds(0,75,500,20);
		horizontalseparator.setBackground(Color.BLACK);
	}
	
	public static void main(String args[]){
		A a= new A();	
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(500,400);
		a.setVisible(true);	
		
	}
	
	
	

}
