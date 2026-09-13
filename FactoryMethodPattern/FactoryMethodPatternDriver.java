package FactoryMethodPattern;

import FactoryMethodPattern.Logger.*;
import FactoryMethodPattern.Factory.*;

public class FactoryMethodPatternDriver {

    public static void main(String[] args) {
        IFactory errorLoggerFactory = new ErrorLoggerFactory();
        ILogger errorLogger = errorLoggerFactory.createLogger();
        errorLogger.log("This is an error message.");
        
        IFactory infoLoggerFactory = new InfoLoggerFactory();
        ILogger infoLogger = infoLoggerFactory.createLogger();
        infoLogger.log("This is an info message.");

        IFactory debugLoggerFactory = new DebugLoggerFactory();
        ILogger debugLogger = debugLoggerFactory.createLogger();
        debugLogger.log("This is a debug message.");
    }

}
