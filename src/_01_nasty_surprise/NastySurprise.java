package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("trick");
		JButton button2 = new JButton("treat");
public static void main(String[] args) {
	NastySurprise ns = new NastySurprise();
		ns.setup();
}

		void setup() {
		frame.setVisible(true);
		button1.addActionListener(this);
		panel.add(button1);
		button2.addActionListener(this);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		}

		private void showPictureFromTheInternet(String imageUrl) {
		    try {
		        URL url = new URL(imageUrl);
		        Icon icon = new ImageIcon(url);
		        JLabel imageLabel = new JLabel(icon);
		        JFrame frame = new JFrame();
		        frame.add(imageLabel);
		        frame.setVisible(true);
		        frame.pack();
		    } catch (MalformedURLException e) {
		        e.printStackTrace();
		    }
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource().equals(button1)) {
			showPictureFromTheInternet("https://www.bestfunnies.com/wp-content/uploads/2015/05/TOP-30-Cute-Puppies-Cute-Puppy-10.jpg");	
			}
			
			if (e.getSource().equals(button2)) {
			showPictureFromTheInternet("http://cdn3.whatculture.com/images/2017/10/9ecc331a6c0db095-600x338.jpg");
			}
		}
}