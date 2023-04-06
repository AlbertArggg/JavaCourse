import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guiStuff implements ActionListener 
{
	private static JTextField A1, A2, A3, A4;				// instantiate JTextFields
	
	public static void main(String[] args) 					
	{
		JFrame frame = new JFrame();					// instantiate frame
		JPanel panel = new JPanel();					// instantiate panel
		
		frame.setSize(250, 210);					// set frame size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// close behavious = exit completely
		frame.setVisible(true);						// make frame visible
		frame.add(panel);						// add panel to frame
		panel.setLayout(null);						// set layout of panel to null
		
		JLabel Q1 = new JLabel("1 + 1 = ");				// create a new label with text "1 + 1 = "
		Q1.setBounds(10, 20, 80, 25);					// set label bounds by passing pos x, pox y, width and length
		panel.add(Q1);							// add Q1 to panel
		
		A1 = new JTextField(20);					// create a textField for user input
		A1.setBounds(60, 20, 165, 25);					// set TextField bounds by passing pos x, pox y, width and length
		panel.add(A1);							// add A1 to panel
		
		JLabel Q2 = new JLabel("2 + 3 = ");
		Q2.setBounds(10, 50, 80, 25);
		panel.add(Q2);
		
		A2 = new JTextField(20);
		A2.setBounds(60, 50, 165, 25);
		panel.add(A2);
		
		JLabel Q3 = new JLabel("7 + 1 = ");
		Q3.setBounds(10, 80, 80, 25);
		panel.add(Q3);
		
		A3 = new JTextField(20);
		A3.setBounds(60, 80, 165, 25);
		panel.add(A3);
		
		JLabel Q4 = new JLabel("2 + 2 = ");
		Q4.setBounds(10, 110, 80, 25);
		panel.add(Q4);
		
		A4 = new JTextField(20);
		A4.setBounds(60, 110, 165, 25);
		panel.add(A4);
		
		JButton button = new JButton("submit");				// instantiate button with text "submit"
		button.setBounds(60, 140, 165, 25);				// set bounds (like textfield and label)
		button.addActionListener(new guiStuff());			// add action for pressing button
		panel.add(button);						// add button to panel
		
		frame.setVisible(true);						// set frame visible
	}

	@Override
	public void actionPerformed(ActionEvent e) 				// override action performed method
	{
		int A01 = 0, A02 = 0, A03 = 0, A04 = 0, grade = 0;		// integers for data
		
		try 								// try to..
		{
			A01 = Integer.parseInt(A1.getText());			// get textfield from user and store in int
			A02 = Integer.parseInt(A2.getText());
			A03 = Integer.parseInt(A3.getText());
			A04 = Integer.parseInt(A4.getText());
		}
		
		catch(Exception e1)
		{
			System.out.println("inavlid input");			// if try fails, throw exception
		}
		
		if(A01 == 2) {grade += 25;}					// if answer correct grade += 25
		if(A02 == 5) {grade += 25;}
		if(A03 == 8) {grade += 25;}
		if(A04 == 4) {grade += 25;}
		
		System.out.println("Grade: " + grade);				// print out to console the students grade
	}
}































