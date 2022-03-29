package br.com.hdi.teste.api.utility.exceptions;

public class ApiResourceGeneric extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;

    public ApiResourceGeneric(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
