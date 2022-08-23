package creationalDesignPatterns.prototypeMethod;

/**
 * @author AmanK
 *
 */
public class Rectangle extends Shape {

	public int width;
	public int height;

	Rectangle() {
		super();
	}

	Rectangle(Rectangle source) {
		super(source);
		this.width = source.width;
		this.height = source.height;
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	@Override
	public String toString() {
		return "\nCircle [ height: " + this.height + " width: " + this.width + ", color: " + this.color + "]";
	}
}
