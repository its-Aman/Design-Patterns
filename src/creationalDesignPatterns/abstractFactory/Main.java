package creationalDesignPatterns.abstractFactory;

/**
 * @author AmanK
 *
 *         Abstract Factory is a creational design pattern that lets you produce
 *         families of related objects without specifying their concrete
 *         classes.
 */

public class Main {
	public static void main(String[] args) {
		/*
		 * Here goes the client Code.
		 */

		FurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();

		Chair artDecoChair = artDecoFactory.createChair();
		Sofa artDecoSofa = artDecoFactory.createSofa();
		Coffee_Table artDecoCoffee_Table = artDecoFactory.createCoffeeTable();

		artDecoChair.sitOn();
		artDecoSofa.setColor(FurnitureColor.Orange);
		artDecoCoffee_Table.setSize(4);

	}
}
