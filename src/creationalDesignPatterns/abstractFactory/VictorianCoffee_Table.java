package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */
public class VictorianCoffee_Table implements Coffee_Table {

	private FurnitureColor color = FurnitureColor.Indigo;
	private int size = 0;

	@Override
	public FurnitureType getType() {
		return FurnitureType.Victorian;
	}

	@Override
	public FurnitureColor getColor() {
		return this.color;
	}

	@Override
	public void setColor(FurnitureColor color) {
		this.color = color;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}

}
