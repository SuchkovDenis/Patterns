package singleton;

public class SingletonLazySync {
    private static SingletonLazySync ourInstance;

    public static synchronized SingletonLazySync getInstance() {
        if (ourInstance == null)
            ourInstance =new SingletonLazySync();
        return ourInstance;
    }

    private SingletonLazySync() {
    }
}
