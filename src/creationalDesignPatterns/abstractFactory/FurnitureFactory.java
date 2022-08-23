package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */

public interface FurnitureFactory {

	public Chair createChair();

	public Sofa createSofa();

	public Coffee_Table createCoffeeTable();

}
