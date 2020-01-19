package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
Random random = new Random();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
int one = 0;
int two = 0;
int three = 0;
	
void setup() {
frame.setVisible(true);
button.setText("SPIN");
panel.add(button);
//one = random.nextInt(3);
//two = random.nextInt(3);
//three = random.nextInt(3);
try {
	label1 = createLabelImage("corgi.jpg");
	label2 = createLabelImage("husky.jpg");
	label2 = createLabelImage("pomeranian .jpg");
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}
panel.add(label1);
panel.add(label2);
panel.add(label3);
frame.add(panel);
frame.pack();
}

public static void main(String[] args) {
SlotMachine SlotMachine = new SlotMachine();
SlotMachine.setup();
}	

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
}
