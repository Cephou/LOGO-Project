package src.Exception;

/**
 * @author pc
 *
 */
public class tooLongStringException extends Exception {
	public tooLongStringException(){
		System.out.println("Exception: lenght was expected to be inferior to 500");
	}

}
