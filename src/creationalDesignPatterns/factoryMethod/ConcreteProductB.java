package creationalDesignPatterns.factoryMethod;
/**
 * @author AmanK
 *
 */
public class ConcreteProductB implements Product {

	private String type;

	private int price;

	private String origin;

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void addQuantity(int quantity) {
		System.out.println(ConcreteProductB.class + " is counting quantity: " + quantity);
	}

	@Override
	public void doStuff() {
		System.out.println(ConcreteProductB.class + " easy peasy stuff !!!");
	}

}
