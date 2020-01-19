package _11_whack_a_mole;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

JFrame frame = new JFrame();
JPanel panel = new JPanel();
	
void setup() {
frame.setSize(10, 14);
frame.setVisible(true);
panel.setPreferredSize(new Dimension(500, 300));
drawButtons(new Random().nextInt(24));
frame.add(panel);
frame.pack();
}	
 
public static void main(String[] args) {
WhackAMole mole = new WhackAMole();
mole.setup();
}

void drawButtons(int random) {
for (int i = 0; i < 24; i ++){
JButton button = new JButton();
button.addActionListener(this);
panel.add(button);
if (random == i) {
button.setText("mole");	
}
}	
}

void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	
	
JButton mole = (JButton) e.getSource();
	if (!mole.getText().equals("mole")) {
		speak("You missed");	
		}
	frame.remove(panel);
	panel = new JPanel();
	panel.setPreferredSize(new Dimension(500, 300));
	drawButtons(new Random().nextInt(24));
	frame.add(panel);
	frame.pack();
	
}
}
