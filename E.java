package hitesh;



import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

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

class E extends JFrame{
	
	private JLabel item1;
	private JSeparator item2;
	private JLabel item3;
	private JTextField item4;
	private JButton item5;
	private ImageIcon image;
	private JLabel lbl;

public E(){
		
		super("UNHIDE");
		this.getContentPane().setBackground(Color.YELLOW);
		Container c = getContentPane();
		setLayout(new FlowLayout());

		Icon a = new ImageIcon(getClass().getResource("rsz_unlock_black.png"));
		
		item1=new JLabel("Set Path To Unlock");
		item2=new JSeparator();
		item3=new JLabel("Enter The Path To Unlock:");
		item4= new JTextField();
		item5 = new JButton("Unlock",a);
		
		image = new ImageIcon(getClass().getResource("rsz_unlock.png"));
		lbl=new JLabel(image);
		
		Font myfont=new Font("Serif", Font.ITALIC | Font.BOLD |Font.ROMAN_BASELINE,26);
		Font newFont1= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE); 
		Font newFont2 = myfont.deriveFont(Font.BOLD,15);
		Font newFont3= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE+Font.BOLD,14);

		c.setLayout(null);
		
		c.add(item1);
		item1.setBounds(150,20,500,30);
		item1.setFont(newFont1);
		
		c.add(item2);
		item2.setBounds(0,75,500,30);
		item2.setBackground(Color.BLACK);
		
		c.add(item3);
		item3.setBounds(85,100,200,20);
		item3.setFont(newFont2);
		
		c.add(item4);
		item4.setBounds(300,100,150,20);
		
		item5.setBackground(Color.WHITE);
		c.add(item5);
		item5.setBounds(190,250,100,20);
		
		item5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	item5.setBackground(Color.RED);
            	FolderLockButtonUnhideActionPerformed(evt);
            
            	
            }

			 private void FolderLockButtonUnhideActionPerformed(ActionEvent evt) {
        try {
                File fileToUnhide=new File(getSelectFileTextUnhide());
                if(fileToUnhide.isHidden()){
                    String lockString="attrib -H -S "+fileToUnhide.getAbsolutePath();
                    Process runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", lockString });
                    runtimeProcess.waitFor(); 
                     if(runtimeProcess.exitValue()==0) {
                       JOptionPane.showMessageDialog(null, "File unlocked Successfully ");
                     }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Can not unlock the file");
            }
        }

			
			});

		
		c.add(lbl);
		lbl.setBounds(165,120,150,150);

}
public String getSelectFileTextUnhide() {
    return item4.getText();
}
}