package structuralDesignPattern.adapter;

/**
 * @author AmanK
 *
 */
public class SquarePegAdapter extends RoundPeg {
	SquarePeg peg;

	SquarePegAdapter(SquarePeg peg) {
		super((int) (peg.getWidth() / Math.sqrt(2)));
		this.peg = peg;
	}
}
