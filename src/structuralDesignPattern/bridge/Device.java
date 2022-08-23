package structuralDesignPattern.bridge;

/**
 * @author AmanK
 *
 */
public interface Device {

	boolean isEnabled();

	void enable();

	void disable();

	int getVolume();

	void setVolume(int vol) throws VolumeOutOfBoundException;

	int getChannel();

	void setChannel(int chNo) throws ChannelOutOfBoundException;

}
