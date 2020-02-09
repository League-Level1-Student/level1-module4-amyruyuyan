package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
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
button.addActionListener(this);

one = random.nextInt(3);
two = random.nextInt(3);
three = random.nextInt(3);
try {
	label1 = createLabelImage("corgi.jpg");
	label2 = createLabelImage("huskyyy.jpg");
	label3 = createLabelImage("pomeranian .jpg");
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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	try {
panel.remove(label1);
panel.remove(label2);	
panel.remove(label3);
panel.remove(button);
frame.remove(panel);
panel = new JPanel();
	
	int rand = random.nextInt(3);
	
//label1
if (rand == 0) {
	label1 = createLabelImage("corgi.jpg");
}
else if (rand == 1){	
	label1 = createLabelImage("huskyyy.jpg");
}
else {	
	label1 = createLabelImage("pomeranian .jpg");
}

int rand1 = random.nextInt(3);

//label2
if (rand1 == 0) {
	label2 = createLabelImage("corgi.jpg");
}
else if (rand1 == 1){	
	label2 = createLabelImage("huskyyy.jpg");
}
else {	
	label2 = createLabelImage("pomeranian .jpg");
}

int rand2 = random.nextInt(3);

//label3
if (rand2 == 0) {
	label3 = createLabelImage("corgi.jpg");
}
else if (rand2 == 1){	
	label3 = createLabelImage("huskyyy.jpg");
}
else {	
	label3 = createLabelImage("pomeranian .jpg");
}



panel.add(button);
panel.add(label1);
panel.add(label2);	
panel.add(label3);
frame.add(panel);
frame.pack();

if (rand == rand1 && rand1 == rand2) {
	JOptionPane.showMessageDialog(null, "CONGRATS! YOU WIN!");
}
	
	} catch (Exception e2) {
		// TODO: handle exception
	}

}
}
