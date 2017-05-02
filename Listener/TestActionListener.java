import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TestActionListener extends JFrame implements ActionListener{
	private JButton jbtOk = new JButton("OK");
	private JButton jbtCancel = new JButton("Cancel");
	int i = 0;

	public TestActionListener(){
		setTitle("TestActionListener");

		getContentPane().setLayout(new FlowLayout());

		getContentPane().add(jbtOk);
		getContentPane().add(jbtCancel);

		jbtOk.addActionListener(this);
		jbtCancel.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == jbtOk){
			i++;
			System.out.println("The OK button is clicked" + i );
		}
		else if(e.getSource() == jbtCancel){
			System.out.println("The Cancel button is clicked");
		}
	}

	public static void main(String[] args){
		TestActionListener frame = new TestActionListener();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(100, 80);
		frame.setVisible(true);
	}


	
}