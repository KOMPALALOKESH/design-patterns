package FactoryMethodPattern.Factory;

import FactoryMethodPattern.Logger.ErrorLogger;
import FactoryMethodPattern.Logger.ILogger;

public class ErrorLoggerFactory implements IFactory {
    @Override
    public ILogger createLogger() {
        return new ErrorLogger();
    }

}
