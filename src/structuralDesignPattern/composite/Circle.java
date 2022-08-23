package structuralDesignPattern.composite;

/**
 * @author AmanK
 *
 */
public class Circle extends Dot {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y, double raduis) {
		super(x, y);
		this.radius = raduis;
	}

	@Override
	public void draw() {
		System.out.println(this.getClass().getName().concat(": is drawing Circle of radius: " + this.radius));
		super.draw();
	}

}
