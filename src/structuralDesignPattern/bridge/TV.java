package structuralDesignPattern.bridge;

/**
 * @author AmanK
 *
 */
public class TV implements Device {
	private boolean isOn;
	private int vol;
	private int ch;

	public TV() {
		System.out.println(this.getClass().getName() + ": is initilizing...");
	}

	@Override
	public boolean isEnabled() {
		System.out.println(this.getClass().getName() + ": is on? \t" + this.isOn);
		return this.isOn;
	}

	@Override
	public void enable() {
		System.out.println(this.getClass().getName() + ": is turning on...");
		this.isOn = true;
	}

	@Override
	public void disable() {
		System.out.println(this.getClass().getName() + ": is turning off...");
		this.isOn = false;
	}

	@Override
	public int getVolume() {
		System.out.println(this.getClass().getName() + ": current Volume: " + this.vol);
		return this.vol;
	}

	@Override
	public void setVolume(int vol) throws VolumeOutOfBoundException {
		System.out.println(this.getClass().getName() + ": setting Volume: " + vol);

		if (vol > 100 || vol < 0)
			throw new VolumeOutOfBoundException(
					this.getClass().getName() + ": volume not allowed greater then 100 or less then 0");

		this.vol = vol;
		System.out.println(this.getClass().getName() + ": current Volume: " + this.vol);
	}

	@Override
	public int getChannel() {
		System.out.println(this.getClass().getName() + ": current Channel: " + this.ch);
		return this.ch;
	}

	@Override
	public void setChannel(int ch) throws ChannelOutOfBoundException {
		System.out.println(this.getClass().getName() + ": setting Channel: " + ch);

		if (ch < 0 || ch > 1000)
			throw new ChannelOutOfBoundException(
					this.getClass().getName() + ": channel not available greater then 1000 or less then 0");
		this.ch = ch;
		System.out.println(this.getClass().getName() + ": current Channel: " + this.ch);
	}
}
