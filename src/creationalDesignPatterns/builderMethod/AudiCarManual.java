package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 */
public class AudiCarManual implements CarManual {

	@Override
	public int numberOfPages() {
		return 24;
	}

	public void readManual() {
		System.out.println("reading out loud the manual");
	}
}
