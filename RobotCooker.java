package core.java2;

public class RobotCooker extends Robot{
	private String name = ("Я RobotCooker - ");
	@Override
	public void work(){
		System.out.println(name + "Я просто готую");
	}
}
