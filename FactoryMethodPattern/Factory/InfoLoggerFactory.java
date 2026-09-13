package FactoryMethodPattern.Factory;

import FactoryMethodPattern.Logger.ILogger;
import FactoryMethodPattern.Logger.InfoLogger;

public class InfoLoggerFactory implements IFactory {
    @Override
    public ILogger createLogger() {
        return new InfoLogger();
    }

}
