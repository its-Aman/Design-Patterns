package structuralDesignPattern.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author AmanK
 *
 */
public class CompoundGraphic implements Graphic {

	private List<Graphic> kids;

	public CompoundGraphic() {
		this.kids = new LinkedList<>();
	}

	@Override
	public void move(int x, int y) {
		this.kids.forEach(kid -> {
			kid.move(x, y);
			System.out.println(kid.getClass().getName().concat(": is moving with \t x: " + x + "\t y: " + y));
		});
	}

	@Override
	public void draw() {
		this.kids.forEach(kid -> {
			kid.draw();
			System.out.println(kid.getClass().getName().concat(": is drawing"));
		});

	}

	public void add(Graphic kid) {
		System.out.println(kid.getClass().getName().concat(": is being added"));
		this.kids.add(kid);
	}

	public void remove(Graphic kid) {
		System.out.println(kid.getClass().getName().concat(": is being removed"));
		this.kids.remove(kid);
	}

}
