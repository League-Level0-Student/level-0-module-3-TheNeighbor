
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 4th";
		String dadsBirthday = "December 7th";
		String myBirthday = "July 8th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog("Who's birthday do you want? My mom's birthday, my dad's birthday, or my birthday? Type in Mom, Dad, or my birthday. Caps don't matter.");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
		if (birthday.equalsIgnoreCase("Mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		else if (birthday.equalsIgnoreCase("Dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if (birthday.equalsIgnoreCase("My Birthday")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
