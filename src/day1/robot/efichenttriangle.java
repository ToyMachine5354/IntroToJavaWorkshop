package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class efichenttriangle {
	public static void main(String[] args) {
		Robot trirobot= new Robot();
	    for (int i = 0; i < 150; i++) {
		trirobot.penDown();
		trirobot.setSpeed(10);
		trirobot.turn(360/100);
		trirobot.move(20);
	    }
		
	}
}
