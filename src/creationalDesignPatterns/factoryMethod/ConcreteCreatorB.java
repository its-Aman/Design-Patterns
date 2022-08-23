package creationalDesignPatterns.factoryMethod;
/**
 * @author AmanK
 *
 */
public class ConcreteCreatorB extends Creator {

	@Override
	public Product createProduct() {
		this.sayHi();
		return new ConcreteProductB();
	}

	private void sayHi() {
		System.out.println(ConcreteCreatorA.class + " Hi there :)");
	}

}
