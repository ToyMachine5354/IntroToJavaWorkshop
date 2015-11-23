package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class trianglerobot {
	public static void main(String[] args) {
	Robot trianglerobot= new Robot();
	trianglerobot.penDown();
	trianglerobot.turn(90);
	trianglerobot.move(100);
	trianglerobot.turn(120);
	trianglerobot.move(100);
	trianglerobot.turn(120);
	trianglerobot.move(100);
	
	}
}
