package creationalDesignPatterns.singletonMethod;

/**
 * @author AmanK
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	Database db1, db2, db3;

	public static void main(String[] args) {

		MainApp app = new MainApp();

		Thread t1 = new Thread(() -> {
			app.db1 = Database.getInstance();
			app.db1.query("Select * from ...");
		});

		Thread t2 = new Thread(() -> {
			app.db2 = Database.getInstance();
			app.db2.query("Drop DB *");
		});

		Thread t3 = new Thread(() -> {
			app.db3 = Database.getInstance();
			app.db3.query("Drop DB *");
		});

		t2.run();
		t1.run();
		t3.run();

		System.out.println(
				app.db1.equals(app.db2) + "\t" + app.db1.equals(app.db3) + "\t" + app.db3.equals(app.db2) + "\t");
	}

}
