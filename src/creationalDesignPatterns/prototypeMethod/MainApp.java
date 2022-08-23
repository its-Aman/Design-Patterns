package creationalDesignPatterns.prototypeMethod;

import java.util.LinkedList;
import java.util.List;

/**
 * @author AmanK
 *
 */
public class MainApp {

	private List<Shape> shapes;
	private Circle baseCircle;
	private Rectangle baseRectangle;

	public static void main(String[] args) {
		MainApp ma = new MainApp();

		System.out.println(ma);
	}

	MainApp() {
		this.shapes = new LinkedList<>();

		this.createBaseCircle();
		this.createBaseRectangle();

//		lets add 5 circles
		for (int i = 0; i < 5; i++)
			this.cloneAndAddCircle();

//		lets add 5 rectangle
		for (int i = 0; i < 5; i++)
			this.cloneAndAddRectangle();

	}

	private void createBaseCircle() {
		this.baseCircle = new Circle();
		this.baseCircle.radius = 10;
		this.baseCircle.color = "BLUE";
	}

	private void createBaseRectangle() {
		this.baseRectangle = new Rectangle();
		this.baseRectangle.height = 10;
		this.baseRectangle.width = 50;
		this.baseRectangle.color = "RED";
	}

	private void cloneAndAddCircle() {
		this.shapes.add(this.baseCircle.clone());
	}

	private void cloneAndAddRectangle() {
		this.shapes.add(this.baseRectangle.clone());
	}

	public String toString() {
		return this.shapes.toString();
	}
}
