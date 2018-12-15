
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		rob.setX(100);
		rob.setY(110);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.
		rob.penDown();
		rob.setPenColor(Color.yellow);
		rob.setPenWidth(10);
		rob.setSpeed(50);
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);
		}
		rob.setX(200);
		rob.setY(200);
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);
		}
		rob.setX(300);
		rob.setY(300);
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);
		}
		rob.setX(400);
		rob.setY(400);
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);
		}
		rob.setX(500);
		rob.setY(500);
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);
		}

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
