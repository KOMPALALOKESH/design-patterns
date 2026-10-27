package TemplatePattern;

public abstract class DataMiner {
    
    public final void mineData() {
        openFile();
        extractData();
        logData();
    }

    protected void openFile() {
        System.out.println("Opening file...");
    }

    protected abstract void extractData();

    protected final void logData() {
        System.out.println("Logging data...");
    }

}
