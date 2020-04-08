import javax.swing.*;  
public class optionpane {  
JFrame f;  
optionpane()
	{  
    f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name");      
	}  
public static void main(String[] args)
	{  
    new optionpane();  
}  
}  
