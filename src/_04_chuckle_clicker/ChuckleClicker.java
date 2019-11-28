package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
	
public static void main(String[] args) {
}

void makeButtons(){
JOptionPane.showMessageDialog(null, "Make Buttons");

JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();
JButton jokeButton = new JButton("joke");
jokeButton.addActionListener(null);
JButton punchline = new JButton("punchline");
punchline.addActionListener(null);
frame.add(panel);
frame.add(jokeButton);
frame.add(punchline);
frame.pack();


}
}
