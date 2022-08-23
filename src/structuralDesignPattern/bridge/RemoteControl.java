package structuralDesignPattern.bridge;

/**
 * @author AmanK
 *
 */
public class RemoteControl {
	protected Device device;

	public RemoteControl(Device device) {
		System.out.println(this.getClass().getName() + ": is initilizing...");
		this.device = device;
	}

	public void togglePower() {
		System.out.println(this.getClass().getName() + ": toggling power.");
		if (this.device.isEnabled())
			this.device.disable();
		else
			this.device.enable();
	}

	public void volumeDown() {
		System.out.println(this.getClass().getName() + ": reducing volume by 10");
		try {
//			this.device.setVolume(this.device.getVolume() - 10);
			this.device.setVolume(Math.max(this.device.getVolume() - 10, 0));
		} catch (VolumeOutOfBoundException e) {
			e.printStackTrace();
		}
	}

	public void volumeUp() {
		System.out.println(this.getClass().getName() + ": gaining volume by 10");
		try {
//			this.device.setVolume(this.device.getVolume() + 10);
			this.device.setVolume(Math.min(this.device.getVolume() + 10, 100));
		} catch (VolumeOutOfBoundException e) {
			e.printStackTrace();
		}
	}

	public void channelDown() {
		System.out.println(this.getClass().getName() + ": reducing channel by 1");
		try {
//			this.device.setChannel(this.device.getChannel() - 1);
			this.device.setChannel(Math.max(this.device.getChannel() - 1, 0));
		} catch (ChannelOutOfBoundException e) {
			e.printStackTrace();
		}
	}

	public void channelUp() {
		System.out.println(this.getClass().getName() + ": gaining channel by 1");
		try {
//			this.device.setChannel(this.device.getChannel() + 1);
			this.device.setChannel(Math.min(this.device.getChannel() + 1, 100));
		} catch (ChannelOutOfBoundException e) {
			e.printStackTrace();
		}
	}
}
