package creationalDesignPatterns.factoryMethod;
/**
 * @author AmanK
 *
 */
public abstract class Creator {

	public abstract Product createProduct();

	public void someOperation() {
		System.out.println(this.toString() + " <- wow!");

	}
}
