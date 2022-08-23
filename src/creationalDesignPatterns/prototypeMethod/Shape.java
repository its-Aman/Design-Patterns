package creationalDesignPatterns.prototypeMethod;

/**
 * @author AmanK
 *
 */
public abstract class Shape {
	
	public int X;
	public int Y;
	public String color;

	Shape() {
	}

	Shape(Shape shape) {
		this.X = shape.X;
		this.Y = shape.Y;
		this.color = shape.color;
	}

	abstract public Shape clone();
}
