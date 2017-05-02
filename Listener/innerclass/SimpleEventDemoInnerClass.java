import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleEventDemoInnerClass extends JFrame{
	private JButton jbtOne, jbtTwo ;
	private int clickCount = 0;
	public SimpleEventDemoInnerClass() {
		jbtOne = new JButton("One");
		jbtTwo = new JButton("Two");
		setLayout(new FlowLayout());
		add(jbtOne);
		add(jbtTwo);

		jbtOne.addActionListener(new OneListener());
		jbtTwo.addActionListener(new TwoListener());
	}

	public static void main(String[] args){
		JFrame frame = new SimpleEventDemoInnerClass();
		frame.setTitle("SimpleEventDemoInnerClass");
		frame.setLocaltionRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}

private class OneListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		clickCount++;
		System.out.println("Button " + jbtOne.getText() + " was clicked. \n" +
					"Buttons have been clicked " + clickCount + " time(s)" );
		if(clickCount%2 == 0)
			jbtOne.setText("One");
		else
			jbtOne.setText("1");
	}
}

private class TwoListener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		clickCount++;
		System.out.println("Button " + jbtTwo.getText() + " was clicked. \n" +
					"Buttons have been clicked " + clickCount + " time(s)" );
		if(clickCount%2 == 0)
			jbtTwo.setText("Two");
		else
			jbtTwo.setText("2");
	}
}
