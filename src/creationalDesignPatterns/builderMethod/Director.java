package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 */
public class Director<T extends Builder> {
	T builder;

	public Director(T builder) {
		this.builder = builder;
	}

	public void makeAudi() {
		this.builder.reset();

		Engine engine = new JapneseEngine();
		engine.setName("Herculice");
		engine.setPower(1200);
		engine.size("L");

		this.builder.setSeats(4);
		this.builder.setEngine(engine);
		this.builder.setTripComputer();
		this.builder.setGPS();
	}
}
