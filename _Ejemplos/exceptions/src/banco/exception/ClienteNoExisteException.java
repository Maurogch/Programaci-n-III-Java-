package banco.exception;

/**
 * Todas las excepciones que creemos deben ser subclases de
 * {@link Exception}
 */
public class ClienteNoExisteException extends Exception {
    public ClienteNoExisteException(String message) {
        super(message);
    }
}
