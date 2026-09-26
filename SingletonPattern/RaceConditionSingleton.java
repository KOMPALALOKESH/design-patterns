package SingletonPattern;

public class RaceConditionSingleton {
    private static RaceConditionSingleton instance;

    private RaceConditionSingleton() {
        // Private constructor to prevent instantiation
        System.out.println("Object created: " + this);
    }

    public static RaceConditionSingleton getInstance() {
        if (instance == null) {
            synchronized (RaceConditionSingleton.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(100);
                    } catch(Exception e) {}

                    instance = new RaceConditionSingleton();
                }
            }
        }
        return instance;
    }

}
