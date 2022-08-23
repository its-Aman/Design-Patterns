package creationalDesignPatterns.builderMethod;

/**
 * @author AmanK
 *
 *         Builder is a creational design pattern that lets you construct
 *         complex objects step by step. The pattern allows you to produce
 *         different types and representations of an object using the same
 *         construction code.
 */

public class Main {
	public static void main(String[] args) {
		buildAudiCar();
		buildAudiCarManual();
	}

	private static void buildAudiCarManual() {
		AudiCarManualBuilder manualBuilder = new AudiCarManualBuilder();
		Director<AudiCarManualBuilder> director = new Director<AudiCarManualBuilder>(manualBuilder);

		director.makeAudi();

		CarManual A4Manual = manualBuilder.getResult();

		System.out.println("My new Audi Car manual is " + A4Manual);

	}

	private static void buildAudiCar() {
		AudiCarBuilder carBuilder = new AudiCarBuilder();
		Director<AudiCarBuilder> director = new Director<AudiCarBuilder>(carBuilder);

		director.makeAudi();

		Car A4 = carBuilder.getResult();

		System.out.println("My new Audi Car is " + A4);
	}
}
