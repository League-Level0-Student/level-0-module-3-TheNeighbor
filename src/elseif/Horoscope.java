package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String cancer = "Emotional, group oriented, seeks security, family.";
	String aries = "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.";
	String leo = "Generous, organized, protective, beautiful.";
	String zodiac = JOptionPane.showInputDialog("What is your zodiac sign?"); 
	if(zodiac.equalsIgnoreCase("cancer")) {
		JOptionPane.showMessageDialog(null, cancer);
	}
	if(zodiac.equalsIgnoreCase("aries")) {
		JOptionPane.showMessageDialog(null, aries);
	}
	if(zodiac.equalsIgnoreCase("leo")) {
		JOptionPane.showMessageDialog(null, leo);
	}
}
}





