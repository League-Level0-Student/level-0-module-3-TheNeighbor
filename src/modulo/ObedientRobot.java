package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public
	   static Robot rob;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   rob=new Robot();
       rob.penDown();
       rob.setSpeed(20);
       drawSquare();
	}  
      public static void drawSquare() {
    	  for (int i = 0; i < 4; i++) {
    			rob.move(100);
    			rob.turn(90);
    		}
      }
      
       
	

}
