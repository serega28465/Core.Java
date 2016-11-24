package core.java2;

public class RobotCoffee extends Robot{
	private String name = ("Я RobotCoffee - ");
	@Override
	public void work(){
		System.out.println(name + "Я просто варю каву");
	}
}
