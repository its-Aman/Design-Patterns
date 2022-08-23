package structuralDesignPattern.bridge;

/**
 * @author AmanK
 *
 */
public class VolumeOutOfBoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5170051171306793122L;

	public VolumeOutOfBoundException(String msg) {
		super(msg);
	}
}
