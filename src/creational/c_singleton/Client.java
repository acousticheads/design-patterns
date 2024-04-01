package creational.c_singleton;

public class Client {

    public static void main(String[] args) throws Exception {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum1.hashCode());
        System.out.println(singletonEnum2.hashCode());



    }
}
