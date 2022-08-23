package structuralDesignPattern.bridge;

/**
 * @author AmanK
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//
		RemoteControl radioRemote = new RemoteControl(new Radio());
		radioRemote.togglePower();
		radioRemote.volumeUp();
		radioRemote.volumeUp();
		radioRemote.volumeUp();
		radioRemote.volumeDown();
		radioRemote.channelDown();
		radioRemote.channelDown();
		radioRemote.channelUp();

		AdvanceRemoteControle tvRemote = new AdvanceRemoteControle(new TV());
		
		tvRemote.togglePower();
		tvRemote.mute();
		tvRemote.volumeDown();
		tvRemote.channelUp();
	}

}
