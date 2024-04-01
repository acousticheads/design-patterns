package creational.g_lazy_initialization;

public class MyHeavyObject {

    private String objectName;

    public MyHeavyObject(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
