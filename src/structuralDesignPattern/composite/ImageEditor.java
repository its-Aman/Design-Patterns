package structuralDesignPattern.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author AmanK
 *
 */
public class ImageEditor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImageEditor ie = new ImageEditor();
		ie.load();

		ie.groupSelect();
	}

	private List<Graphic> all;

	public ImageEditor() {
		this.all = new LinkedList<>();
	}

	public void load() {
		this.all.add(new Dot(1, 2));
		this.all.add(new Circle(3, 0, 5));
		this.all.add(new Dot(12, 4));
		this.all.add(new Circle(9, 3, 4));
		this.all.add(new Dot(8, 5));
		this.all.add(new Circle(2, 8, 7));
	}

	public void groupSelect() {
		CompoundGraphic group = new CompoundGraphic();

		this.all.forEach(graphic -> {
			group.add(graphic);
		});

		group.move(13, 99);

		group.draw();

		this.all.forEach(graphic -> {
			group.remove(graphic);
		});
	}
}
