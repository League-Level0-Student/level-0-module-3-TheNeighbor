package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	int happy = JOptionPane.showConfirmDialog(null, "Are you happy?");
	if (happy == 0){
		JOptionPane.showMessageDialog(null, "Keep doing whatever your're doing.");
	}
	else if(happy==1) {
	int doWantHappy	= JOptionPane.showConfirmDialog(null, "Do you want to be happy?");	
		if(doWantHappy==0) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		else if(doWantHappy==1) {
			JOptionPane.showMessageDialog(null, "Keep doing whatver you're doing.");
		}
	}
	
		
	}
}

