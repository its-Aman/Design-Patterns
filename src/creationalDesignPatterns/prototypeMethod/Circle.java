package creationalDesignPatterns.prototypeMethod;

/**
 * @author AmanK
 *
 */
public class Circle extends Shape {

	public int radius;

	Circle() {
		super();
	}

	Circle(Circle source) {
		super(source);
		this.radius = source.radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
	public String toString() {
		return "\nCircle [ radius: " + this.radius + ", color: " + this.color + "]";
	}

}
