import devices.Projector;
import devices.SorroundSoundSystem;
import devices.Tv;

public class Person {

	public static void main(String args[]) {
		Tv tv = new Tv("Sony");
		Projector projector = new Projector("Projector X");
		SorroundSoundSystem sound = new SorroundSoundSystem("Sennheiser");
		
		RemoteControl.chooseDevice(tv).turnOn();
		RemoteControl.chooseDevice(projector).turnOn();
		RemoteControl.chooseDevice(sound).turnOn();
	}
	
}
