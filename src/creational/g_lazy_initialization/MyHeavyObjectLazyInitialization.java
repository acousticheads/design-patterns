package creational.g_lazy_initialization;

public class MyHeavyObjectLazyInitialization {

    private MyHeavyObject myHeavyObject;

    public MyHeavyObject getMyHeavyObject() {

        if (myHeavyObject == null) {
            return new MyHeavyObject("heavy data!!");
        } else {
            return myHeavyObject;
        }

    }

}
