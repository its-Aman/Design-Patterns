package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 */
public interface Builder {

	public void reset();

	public void setSeats(int numberOfSeats);

	public void setEngine(Engine engine);

	public void setTripComputer();

	public void setGPS();
}
