package SingletonPattern;

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                RaceConditionSingleton singleton = RaceConditionSingleton.getInstance();
                System.out.println("Thread 1: " + singleton);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                RaceConditionSingleton singleton = RaceConditionSingleton.getInstance();
                System.out.println("Thread 2: " + singleton);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}
