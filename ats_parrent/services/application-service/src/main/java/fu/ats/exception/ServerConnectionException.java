package fu.ats.exception;

import lombok.Getter;

@Getter
public class ServerConnectionException extends RuntimeException {
    private String message;
    public ServerConnectionException(String message) {
        super(message);
        this.message=message;
    }

    public ServerConnectionException() {
    }
}
