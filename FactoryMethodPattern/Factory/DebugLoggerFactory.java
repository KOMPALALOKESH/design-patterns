package FactoryMethodPattern.Factory;

import FactoryMethodPattern.Logger.*;

public class DebugLoggerFactory implements IFactory {
    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }

}
