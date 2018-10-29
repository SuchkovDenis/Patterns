package singleton;

public class SingletonLazyInit {
    private static SingletonLazyInit ourInstance;

    public static SingletonLazyInit getInstance() {
        if (ourInstance == null)
            ourInstance = new SingletonLazyInit();
        return ourInstance;
    }

    private SingletonLazyInit() {
    }
}
