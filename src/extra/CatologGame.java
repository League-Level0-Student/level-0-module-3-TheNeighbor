package extra;

import javax.swing.JOptionPane;

class CatologGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JOptionPane.showMessageDialog(null,"Look online or in a catolog for a table that's worth $500 without typing in [table that's worth $500] in the search bar.");
String check = JOptionPane.showInputDialog("Did you find one.");
if (check.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null, "Good job! You are a skilled shopper.");
}
else if (check.equalsIgnoreCase("No")) {
	JOptionPane.showMessageDialog(null, "You are a bad shopper.");
}
	}

}
