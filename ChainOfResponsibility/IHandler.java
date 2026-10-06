package ChainOfResponsibility;

public abstract class IHandler {
    
    protected IHandler nextHandler;

    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Order order);
}
