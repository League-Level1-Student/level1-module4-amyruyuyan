package _08_calculator;

import java.time.temporal.JulianFields;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
int add(int number1, int number2){
int sum = number1 + number2;
return sum;
}

int sub(int number1, int number2){
int difference = number1 - number2;
return difference;
}

int mult(int number1, int number2){
int answer = number1 * number2;
return answer;
}

int div(int number1, int number2){
int quotient = number1/number2;
return quotient;
}

JFrame frame = new JFrame("Simple Caculator");
JPanel panel = new JPanel();
JButton add = new JButton("add");
JButton sub = new JButton("sub");
JButton mult = new JButton("mult");
JButton div = new JButton("div");
JTextField field1 = new JTextField();
JTextField field2 = new JTextField();
}
