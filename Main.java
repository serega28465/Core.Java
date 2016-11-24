package core.java2;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.work();
		Robot robot2 = new RobotDancer();
		robot2.work();
		Robot robot3 = new RobotCoffee();
		robot3.work();
		Robot robot4 = new RobotCooker();
		robot4.work();
	}

}
