package ejerciciom2;

public class OurException extends Exception {
	private int code;

	/***
	 * Constructor por defecto
	 */
	public OurException() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @param code
	 */
	public OurException(int code) {
		super();
		this.code = code;
	}

	public String getMessage() {
		String message = "";

		switch (code) {
		case 1:
			message = "Ha de cobrar més de 8000€.";
			break;
		case 2:
			message = "Ha de cobrar més de 3000 però menys de 5000€.";
			break;
		case 3:
			message = "Ha de cobrar més de 2700 pero menys de 4000€.";
			break;
		case 4:
			message = "Ha de cobrar més de 1800 pero menys de 2500€.";
			break;
		case 5:
			message = "Ha de cobrar més de 900 pero menys de 1600€.";
			break;
		case 6:
			message = "El Volunteer no puede cobrar mas de 300 mensuales.";
			break;

		default:
			message = "El Volunteer no cobra.";
			break;
		}

		return message;
	}

}
