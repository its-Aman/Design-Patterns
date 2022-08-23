package creationalDesignPatterns.factoryMethod;

/**
 * @author AmanK
 * 
 *         Factory Method is a creational design pattern that provides an
 *         interface for creating objects in a superclass, but allows subclasses
 *         to alter the type of objects that will be created.
 */
public class Main {
	public static void main(String[] args) {

		/*
		 * Here goes the client Code.
		 */
		Creator c1 = new ConcreteCreatorA();

		Product p1 = c1.createProduct();

		c1.someOperation();
		p1.addQuantity(20);
		p1.doStuff();

		Creator c2 = new ConcreteCreatorB();

		Product p2 = c2.createProduct();

		c2.someOperation();
		p2.addQuantity(25);
		p2.doStuff();
	}
}
