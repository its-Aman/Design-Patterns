package structuralDesignPattern.composite;

/**
 * @author AmanK
 *
 */
public class Dot implements Graphic {

	private int x, y;

	public Dot() {
	}

	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println(this.getClass().getName().concat(": is moving with \t x: " + this.x + "\t y: " + this.y));
	}

	@Override
	public void draw() {
		System.out.println(this.getClass().getName().concat(": is drawing"));
	}

}
