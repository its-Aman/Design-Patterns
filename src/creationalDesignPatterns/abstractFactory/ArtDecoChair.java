package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */
public class ArtDecoChair implements Chair {

	private FurnitureColor color = FurnitureColor.Blue;

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
	public void sitOn() {
		System.out.println("Sitting on Chair of type: " + this.getType() + " with color: " + this.getColor());
	}

}
