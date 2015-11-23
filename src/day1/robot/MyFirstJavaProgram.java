package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		Robot evilrobot= new Robot();
		evilrobot.setSpeed(10);
		evilrobot.setRandomPenColor();
	    
		evilrobot.sparkle();
		evilrobot.miniturize();
		evilrobot.move(100);
		evilrobot.penDown();
		evilrobot.turn(90);
		evilrobot.move(100);
		evilrobot.turn(90);
		evilrobot.move(100);
		evilrobot.turn(90);
		evilrobot.move(100);
		evilrobot.turn(90);
		evilrobot.move(100);
		
		
		
		
		
		
	}
}
