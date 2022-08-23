package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 */
public class AudiCar implements Car {

	CarType type;

	@Override
	public CarType getType() {
		return CarType.Audi;
	}

	public void run() {
		System.out.println("wroom wroom ...");
	}
}
