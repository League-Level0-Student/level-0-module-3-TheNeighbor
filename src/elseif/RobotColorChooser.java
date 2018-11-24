//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot c0lor = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for (int i=0;i<10;) {
		String userColor = JOptionPane.showInputDialog("What color do you want?");
		// 5. Use an if/else statement to set the pen color that the user requested
		if (userColor.equalsIgnoreCase("red")) {
			c0lor.setPenColor(Color.red);
		}
		else if (userColor.equalsIgnoreCase("blue")) {
			c0lor.setPenColor(Color.blue);
		}
		else if (userColor.equalsIgnoreCase("green")) {
			c0lor.setPenColor(Color.green);
		}
		else if (userColor.equalsIgnoreCase("yellow")) {
			c0lor.setPenColor(Color.yellow);
		}
		else if (userColor.equalsIgnoreCase("orange")) {
			c0lor.setPenColor(Color.orange);
		}
		else if (userColor.equalsIgnoreCase("black")) {
			c0lor.setPenColor(Color.black);
		}
		else if (userColor.equalsIgnoreCase("white")) {
			c0lor.setPenColor(Color.white);
		}
		else if (userColor.equalsIgnoreCase("stop")) {
			break;
		}
		else {
			c0lor.setRandomPenColor();
		
		}
		// 6. If the user doesn’t enter anything, choose a random color
		
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		
		
		// 4. Set the pen width to 10
		c0lor.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		c0lor.penDown();
		c0lor.setSpeed(10);
		for (int j = 0; j < 4; j++) {
			c0lor.move(200);
			c0lor.turn(90);
		}
		
		}
	}
}

