/**
 * 
 */
package projects.exception;

/**
 * @author Asha
 *
 */

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	/**
	 * 
	 */
	public DbException() {
		
	}

	/**
	 * @param message
	 */
	public DbException(String message) {
		super(message);
		
	}

	/**
	 * @param cause
	 */
	public DbException(Throwable cause) {
		
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DbException(String message, Throwable cause) {
		
	}

}
