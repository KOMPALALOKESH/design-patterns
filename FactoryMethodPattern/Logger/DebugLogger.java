package FactoryMethodPattern.Logger;

public class DebugLogger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println("Debug: " + msg);
    }

}
