package devices;

public class Tv extends Device {

	public Tv(String name) {
		super(name);
	}

	@Override
	public void turnOn() {
		System.out.println("TV "+this.toString()+" turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("TV "+this.toString()+" turned off");
	}

}
