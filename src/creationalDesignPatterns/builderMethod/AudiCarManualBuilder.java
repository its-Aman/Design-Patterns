package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 */
public class AudiCarManualBuilder implements Builder {

	private CarManual manual;

	@Override
	public void reset() {
		System.out.println("Resetting the manual...");
		this.manual = new AudiCarManual();
	}

	@Override
	public void setSeats(int numberOfSeats) {
		System.out.println("Writing " + numberOfSeats + " in the manual...");
	}

	@Override
	public void setEngine(Engine engine) {
		System.out.println("Writing the engnie in the manual...");
		System.out.println(engine);
	}

	@Override
	public void setTripComputer() {
		System.out.println("Writing the Trip Computer in the manual...");
	}

	@Override
	public void setGPS() {
		System.out.println("Writing the GPS in the manual...");
	}

	public CarManual getResult() {
		CarManual car = this.manual;
		this.reset();
		return car;
	}
}
