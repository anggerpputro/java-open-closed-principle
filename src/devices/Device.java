package devices;


public abstract class Device {

	private String name;
	
	public Device(String name) {
		this.name = name;
	}
	
	abstract public void turnOn();
	abstract public void turnOff();

	@Override
	public String toString() {
		return "Device [name=" + name + "]";
	}
	
}
