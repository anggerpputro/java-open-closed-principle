package devices;

public class SorroundSoundSystem extends Device {

	public SorroundSoundSystem(String name) {
		super(name);
	}

	@Override
	public void turnOn() {
		System.out.println("Sorround Sound System "+this.toString()+" turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Sorround Sound System "+this.toString()+" turned off");
	}

}
