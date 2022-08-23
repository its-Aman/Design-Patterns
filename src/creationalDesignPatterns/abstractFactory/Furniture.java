package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */
public interface Furniture {
	public FurnitureType getType();

	public FurnitureColor getColor();

	public void setColor(FurnitureColor color);
}
