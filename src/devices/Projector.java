package devices;

public class Projector extends Device {

	public Projector(String name) {
		super(name);
	}

	@Override
	public void turnOn() {
		System.out.println("Projector "+this.toString()+" turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Projector "+this.toString()+" turned off");
	}

}
