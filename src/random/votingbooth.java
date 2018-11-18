package random;

import javax.swing.JOptionPane;

public class votingbooth {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog(null, "how old are you");
		int x = Integer.parseInt(answer);
		if (x > 18) {
			JOptionPane.showMessageDialog(null, "who should be the next president");
		}
		if (x < 18) {
			JOptionPane.showMessageDialog(null, "nobody cares what you think kid");
		}
	}
}
