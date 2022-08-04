// test case: {35, 30, 0, -45}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lecture_2 extends JFrame implements ActionListener{ // public class GUI

	JPanel myPanel;
	JButton okButton, cxlButton;
	JLabel myLabel;
	JTextField inputField;
	public static void main(String[] args) {
		Lecture_2 window = new Lecture_2();
		window.setTitle("GUI");
		window.setSize(2560, 1600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
		/*
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";  
		String s3 = "Welcome to Java";
		String s4 = "Welcome to C++";
		String s5 = new String("Welcome to Java");
		String s6 = new String("Welcome to Java");
        String s7 = new String("Welcome to C++");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());
		*/

	}

	public Lecture_2()
	{
		myPanel = new JPanel();
		add(myPanel);
		okButton = new JButton("OK");
		cxlButton = new JButton("Cancel");
		myPanel.add(okButton);
		myPanel.add(cxlButton);
		myLabel = new JLabel("Enter Your Name:");
		myPanel.add(myLabel);
		inputField = new JTextField("Type Name Here");
		myPanel.add(inputField);
		okButton.addActionListener(this);
		cxlButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == okButton)
		{
			inputField.setText("OK Button is pressed!");
		}
		else if (e.getSource() == cxlButton)
		{
			inputField.setText("Cancel Button is pressed!");
		}
	}
	
}
