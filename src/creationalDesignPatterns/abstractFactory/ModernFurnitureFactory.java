package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */
public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

	@Override
	public Coffee_Table createCoffeeTable() {
		return new ModernCoffee_Table();
	}

}
