package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
int add(int number1, int number2){
int sum = number1 + number2;
return sum;
}

int sub(int number1, int number2){
int difference = number1 - number2;
return difference;
}

int mult(int number1, int number2){
int product = number1 * number2;
return product;
}

int div(int number1, int number2){
int quotient = number1/number2;
return quotient;
}


JFrame frame = new JFrame("Simple Caculator");
JPanel panel = new JPanel();
JButton add = new JButton("add");
JButton sub = new JButton("subtract");
JButton mult = new JButton("multiply");
JButton div = new JButton("divide");
JTextField field1 = new JTextField(10);
JTextField field2 = new JTextField(10);
JLabel label = new JLabel();

public static void main(String[] args) {
Calculator calculator = new Calculator();
calculator.setup();
}

void setup(){
panel.add(add);
panel.add(sub);
panel.add(mult);
panel.add(div);
panel.add(field1);
panel.add(field2);
panel.add(label);
frame.add(panel);
frame.pack();
frame.setVisible(true);
add.addActionListener(this);
sub.addActionListener(this);
mult.addActionListener(this);
div.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String Tf1 = field1.getText();
	String Tf2 = field2.getText();
	int T1 = Integer.parseInt(Tf1);
	int T2 = Integer.parseInt(Tf2);
	
	 if (e.getSource() == add) {
		int sum = add(T1, T2);
		label.setText("" + sum);
	}
	 if (e.getSource() == sub) {
			sub(T1, T2);
				int difference = sub(T1, T2);
				label.setText("" + difference);
	 }
	 
	 if (e.getSource() == mult) {
			mult(T1, T2);
				int product = mult(T1, T2);
				label.setText("" + product);
	 }
	 
	 if (e.getSource() == div) {
			div(T1, T2);
			int quotient = div(T1, T2);
			label.setText("" + quotient);
		}

	 
}
}
