package core.java8;

public class Car {
	
	
	private Steering steering;
	
	private Wheels wheels;
	
	private Body body;

	public Car(Steering steering, Wheels wheels, Body body) {
		this.steering = steering;
		this.wheels = wheels;
		this.body = body;
	}

	public void bw(){
		wheels.bw();
	}
	
	public Steering getSteering() {
		return steering;
	}

	public void setSteering(Steering steering) {
		this.steering = steering;
	}

	public Wheels getWheels() {
		return wheels;
	}

	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return " Авто " + steering + ", " + wheels
				+ ", " + body;
	}
	
	

}
