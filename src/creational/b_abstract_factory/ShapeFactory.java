package creational.b_abstract_factory;

public class ShapeFactory implements ShapeFactoryInterface {

    public Shape getShape(String shapeName) {

        return switch (shapeName) {
            case "circle" -> new Cricle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };

    }

}
