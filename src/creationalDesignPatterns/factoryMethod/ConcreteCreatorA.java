package creationalDesignPatterns.factoryMethod;
/**
 * @author AmanK
 *
 */
public class ConcreteCreatorA extends Creator {

	@Override
	public Product createProduct() {
		this.sayHello();
		return new ConcreteProductA();
	}

	private void sayHello() {
		System.out.println(ConcreteCreatorA.class + " Hello there :)");
	}

}
