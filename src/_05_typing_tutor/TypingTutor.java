package _05_typing_tutor;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
int type;
	
public static void main(String[] args) {
JFrame frame = new JFrame("Type or Die");
frame.setVisible(true);
frame.addKeyListener(null);
char currentLetter;

currentLetter = generateRandomLetter();

char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');
      
JLabel label = new JLabel();
}
}

