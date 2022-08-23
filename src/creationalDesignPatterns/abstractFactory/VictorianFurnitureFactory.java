package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */
public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public Coffee_Table createCoffeeTable() {
		return new VictorianCoffee_Table();
	}

}
