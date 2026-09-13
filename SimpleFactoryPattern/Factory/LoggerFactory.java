package Factory;

import Logger.*;

public class LoggerFactory {
    public static ILogger getLogger(String type) {
        if (type.equalsIgnoreCase("error")) {
            return new ErrorLogger();
        } else if (type.equalsIgnoreCase("info")) {
            return new InfoLogger();
        } else if (type.equalsIgnoreCase("debug")) {
            return new DebugLogger();
        }
        else {
            throw new IllegalArgumentException("Invalid logger type: " + type);
        }
    }
}
