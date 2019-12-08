package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
int type;
char currentLetter;
JLabel label = new JLabel();
JPanel panel = new JPanel();
void setup() {
	JFrame frame = new JFrame("Type or Die");
	frame.setVisible(true);
	frame.addKeyListener(this);
	panel.add(label);
	frame.add(panel);
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
	label.setFont(label.getFont().deriveFont(28));
	label.setHorizontalAlignment(label.CENTER);
}
public static void main(String[] args) {
TypingTutor T = new TypingTutor();
T.setup();
}

char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("you typed " + currentLetter);
	if (e.getKeyChar() == currentLetter) {
	panel.setBackground(Color.GREEN);
	}
	else {
	panel.setBackground(Color.red);	
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
}
}

