package structuralDesignPattern.adapter;

/**
 * @author AmanK
 *
 */
public class RoundHole {
	private int radius;

	RoundHole(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	public boolean fits(RoundPeg peg) {
		return peg.getRadius() <= this.getRadius();
	}
}
