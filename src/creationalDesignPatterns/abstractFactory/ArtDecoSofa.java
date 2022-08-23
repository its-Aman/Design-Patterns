package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */
public class ArtDecoSofa implements Sofa {

	private FurnitureColor color = FurnitureColor.Green;
	private int capacity = 0;

	@Override
	public FurnitureType getType() {
		return FurnitureType.ArtDeco;
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
	public int getCapacity() {
		return this.capacity;
	}

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
