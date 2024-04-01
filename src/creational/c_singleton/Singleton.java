package creational.c_singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton SINGLETON;

    private Singleton() throws Exception {

        if (SINGLETON != null) {
            throw new Exception("Class cannot be created");
        }
    }

    public static Singleton getInstance() throws Exception {

        if (SINGLETON == null) {

            synchronized (Singleton.class) {

                if (SINGLETON == null) {
                    SINGLETON = new Singleton();
                }

            }

        }

        return SINGLETON;

    }

    protected Object readResolve() throws Exception {
        return getInstance();
    }

    public void sayHello() {
        System.out.println("Hello");
    }

}
