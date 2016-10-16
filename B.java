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
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;



public class B extends JFrame {
	private JLabel item1;
	private JSeparator item2;
	private JButton item3;
	private JTextField item4;
	private JButton item5;
	private JLabel item6;
	private JLabel item7;
	private JLabel item8;
	private ImageIcon image;
	private JLabel lbl;
	
	JFileChooser fileChooser=null;
    File selectedFile=null;	
	
	public B(){
		super("LOCK");
		this.getContentPane().setBackground(Color.YELLOW);
		Container c = getContentPane();
		
		Icon a = new ImageIcon(getClass().getResource("rsz_browse.png"));
		Icon b = new ImageIcon(getClass().getResource("rsz_black_lock.png"));
		
		item1=new JLabel("Set Path To Lock");
		item2=new JSeparator();
		item3=new JButton("Browse",a);
		item4 = new JTextField();
		item5= new JButton("Lock",b);
		item6= new JLabel("NOTE : Please Remember the Path");
		item7= new JLabel("Click Browse to Select a Directory");
		item8 = new JLabel("Path Selected:");
		
		image = new ImageIcon(getClass().getResource("rsz_2lock-2.png"));
		lbl=new JLabel(image);
		
		Font myfont=new Font("Serif", Font.ITALIC | Font.BOLD |Font.ROMAN_BASELINE,26);
		Font newFont1= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE); 
		Font newFont2 = myfont.deriveFont(Font.BOLD,15);
		Font newFont3= myfont.deriveFont(Font.ITALIC+Font.ROMAN_BASELINE+Font.BOLD,14);
		Font newFont4 = myfont.deriveFont(Font.BOLD,12);
		
		c.setLayout(null);
		
		c.add(item1);
		item1.setBounds(150,20,500,30);
		item1.setFont(newFont1);
		
		c.add(item2);
		item2.setBounds(0,75,500,30);
		item2.setBackground(Color.BLACK);

		
		item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                item4ActionPerformed(evt);
            }

            private void item4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_FileSelectButtonActionPerformed
		    	fileChooser=new JFileChooser();
		    	fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		    	int returnVal = fileChooser.showOpenDialog(null);
		        if(returnVal == JFileChooser.APPROVE_OPTION) {
		           setSelectedFile(fileChooser.getSelectedFile());
		           setSelectFileText(getSelectedFile().getAbsolutePath());
		           item3.setBackground(Color.RED);
		        }

            }

		});
		
		
		c.add(item3);
		item3.setBounds(65, 150, 100, 20);
		item3.setBackground(Color.WHITE);
		
		c.add(item4);
		item4.setBounds(300, 150, 150, 20);
		
		
		c.add(item5);
		item5.setBounds(185, 300, 100, 20);
		item5.setBackground(Color.WHITE);
		
		item5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	item5.setBackground(Color.RED);
            	item7ActionPerformed(evt);
            }

			
            private void item7ActionPerformed(ActionEvent evt) {
		        try {
		                String lockString="attrib +H +S "+getSelectedFile().getAbsolutePath();
		                Process runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", lockString });
		                runtimeProcess.waitFor(); 
		                 if(runtimeProcess.exitValue()==0) {
		                   JOptionPane.showMessageDialog(null, "Folder locked Successfully ");
		                 }
		            } catch (Exception ex) {
		                JOptionPane.showMessageDialog(null, "Can not lock the file ");
		            }
		    }

	 
	 });
	 
	c.add(item6);
	item6.setBounds(150,330,200,20);
		
	c.add(item7);
	item7.setBounds(150,110,200,20);
	item7.setFont(newFont3);
	
	c.add(item8);
	item8.setBounds(215, 150, 150, 20);
	item8.setFont(newFont4);
	
	c.add(lbl);
	lbl.setBounds(135, 170, 200, 150);
	}
	
	public String getSelectFileTextUnhide() {
        return item4.getText();
    }

	
	
	
	public void setSelectFileText(String SelectFileText) {
        this.item4.setText(SelectFileText);
    }


	public File getSelectedFile() {
        return selectedFile;
    }

	public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

	
		
	
}
