package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 */
public class ArtDecoFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public Coffee_Table createCoffeeTable() {
		return new ArtDecoCoffee_Table();
	}

}
