package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 */
public class AudiCarBuilder implements Builder {

	private Car car;

	@Override
	public void reset() {
		System.out.println("Resetting the car...");
		this.car = new AudiCar();
	}

	@Override
	public void setSeats(int numberOfSeats) {
		System.out.println("Setting " + numberOfSeats + " for the car...");
	}

	@Override
	public void setEngine(Engine engine) {
		System.out.println("Setting the engnie for the car...");
		System.out.println(engine);
	}

	@Override
	public void setTripComputer() {
		System.out.println("Setting the Trip Computer for the car...");
	}

	@Override
	public void setGPS() {
		System.out.println("Setting the GPS for the car...");
	}

	public Car getResult() {
		System.out.println("Sending car : " + this.car.getType());
		Car car = this.car;
		this.reset();
		return car;
	}
}
