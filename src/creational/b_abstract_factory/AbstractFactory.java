package creational.b_abstract_factory;

public class AbstractFactory {

    public static Factory getFactory(String factoryName) {
        if (factoryName.equals("shape")) {
            return new ShapeFactory();
        } else if (factoryName.equals("color")) {
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
