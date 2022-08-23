package structuralDesignPattern.adapter;

/**
 * @author AmanK
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RoundHole roundHole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(5);

		System.out.println(roundHole.fits(roundPeg));

		SquarePeg smallSquarePeg = new SquarePeg(5);
		SquarePeg largeSquarePeg = new SquarePeg(10);

//		roundHole.fits(smallSquarePeg);

		SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
		SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

		System.out.println(roundHole.fits(smallSquarePegAdapter));
		System.out.println(roundHole.fits(largeSquarePegAdapter));
	}

}
