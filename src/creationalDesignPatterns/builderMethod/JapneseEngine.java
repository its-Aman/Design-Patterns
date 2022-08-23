package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 */
public class JapneseEngine implements Engine {

	String name;
	String size;
	int power;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setPower(int hp) {
		this.power = hp;
	}

	@Override
	public void size(String size) {
		this.size = size;
	}

}
