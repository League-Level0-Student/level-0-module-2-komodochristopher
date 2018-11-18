package random;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null,"how tall are you people?");
	int x = Integer.parseInt(answer);
	if(x>48) {
	JOptionPane.showMessageDialog(null,"enjoy your ride");
	}
	if(x<48) {
	JOptionPane.showMessageDialog(null, "go home and eat veggies!");
}
}
}
