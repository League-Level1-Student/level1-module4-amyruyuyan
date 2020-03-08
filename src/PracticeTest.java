import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class PracticeTest implements ActionListener {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JLabel hint = new JLabel();
		JTextField field = new JTextField(20);
		JButton button1 = new JButton("submit");
		JButton button2 = new JButton("hint");
void setup() {
frame.setVisible(true);
label.setText("What five letter word becomes shorter when you add two letters to it?");
panel.add(label);
panel.add(hint);
panel.add(field);
button1.addActionListener(this);
button2.addActionListener(this);
panel.add(button1);
panel.add(button2);
frame.add(panel);
frame.pack();
}
public static void main(String[] args) {
PracticeTest pt = new PracticeTest();
pt.setup();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button2) {
		hint.setText("Think of it literally");
		frame.pack();
	}	
	if (e.getSource() == button1){
		if (field.getText().equalsIgnoreCase("Shorter")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Nope");
		}
	}
	
}

}
