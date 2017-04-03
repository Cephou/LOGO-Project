package src.Exception;

/**
 * @author pc
 *
 */
public class InvalidTeacherAgeException extends Exception {

	/**
	 * 
	 */
	public InvalidTeacherAgeException() {
		System.out.println("Exception : l'age d'un professeur doit être comrpis entre 20 et 70 ans");
	}

	/**
	 * @param message
	 */
	public InvalidTeacherAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public InvalidTeacherAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidTeacherAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public InvalidTeacherAgeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
