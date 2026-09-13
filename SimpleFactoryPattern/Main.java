import Logger.ILogger;
import Factory.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        ILogger errorLogger = LoggerFactory.getLogger("error");
        errorLogger.log("This is an error message.");

        ILogger infoLogger = LoggerFactory.getLogger("info");
        infoLogger.log("This is an info message.");

        ILogger debugLogger = LoggerFactory.getLogger("debug");
        debugLogger.log("This is a debug message.");
    }
}
