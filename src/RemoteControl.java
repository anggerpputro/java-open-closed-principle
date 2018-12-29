import devices.Device;

public class RemoteControl {
	
	public static Device chooseDevice(Device device) {
		return device;
	}

	public static void turnOn(Device device) {
		device.turnOn();
	}
	
	public static void turnOff(Device device) {
		device.turnOff();
	}
	
}
