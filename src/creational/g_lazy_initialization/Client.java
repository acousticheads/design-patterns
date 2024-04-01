package creational.g_lazy_initialization;

public class Client {
    public static void main(String[] args) {

        var myHeavyObjectLazyInitialization = new MyHeavyObjectLazyInitialization();
        MyHeavyObject myHeavyObject = myHeavyObjectLazyInitialization.getMyHeavyObject();
        System.out.println(myHeavyObject.getObjectName());

    }
}
