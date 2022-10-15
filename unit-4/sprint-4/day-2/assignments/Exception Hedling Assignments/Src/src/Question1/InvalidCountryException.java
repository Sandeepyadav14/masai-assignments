package Question1;

public class InvalidCountryException extends Exception{
    public InvalidCountryException() {
    }

    public InvalidCountryException(String message) {
        super(message);
    }

    public InvalidCountryException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCountryException(Throwable cause) {
        super(cause);
    }

    public InvalidCountryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
