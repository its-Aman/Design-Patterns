package structuralDesignPattern.bridge;

/**
 * @author AmanK
 *
 */
public class AdvanceRemoteControle extends RemoteControl {

	public AdvanceRemoteControle(Device device) {
		super(device);
		System.out.println(this.getClass().getName() + ": is initilizing...");
	}

	public void mute() {
		System.out.println(this.getClass().getName() + ": muting device.");
		try {
			this.device.setVolume(0);
		} catch (VolumeOutOfBoundException e) {
			e.printStackTrace();
		}
	}
}
