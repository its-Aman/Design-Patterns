package structuralDesignPattern.adapter;

/**
 * @author AmanK
 *
 */
public class RoundPeg {
	private int radius;

	RoundPeg(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}
}
