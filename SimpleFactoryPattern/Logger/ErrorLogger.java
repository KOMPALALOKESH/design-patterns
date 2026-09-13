package Logger;

public class ErrorLogger implements ILogger {
    @Override
    public void log(String message) {
        System.err.println("Error: " + message);
    }

}
