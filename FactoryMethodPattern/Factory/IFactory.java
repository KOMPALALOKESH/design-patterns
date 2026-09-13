package FactoryMethodPattern.Factory;

import FactoryMethodPattern.Logger.ILogger;

public interface IFactory {
    ILogger createLogger();
}
