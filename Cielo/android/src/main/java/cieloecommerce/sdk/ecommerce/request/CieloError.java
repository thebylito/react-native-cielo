package cieloecommerce.sdk.ecommerce.request;

/**
 * Just represent an error sent by Cielo; most of time, client errors.
 *
 * @see <a href="https://developercielo.github.io/Webservice-3.0/english.html#error-codes">Error Codes</a>
 */
public class CieloError {
    private final Integer Code;
    private final String Message;

    public CieloError(Integer code, String message) {
        this.Code = code;
        this.Message = message;
    }

    /**
     * @return The error code as specified on manual
     */
    public Integer getCode() {
        return Code;
    }

    /**
     * @return The error message as specified on manual
     */
    public String getMessage() {
        return Message;
    }
}
