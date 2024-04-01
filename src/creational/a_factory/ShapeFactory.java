package creational.a_factory;

public class ShapeFactory {

    public static Shape getShape(String shapeName) {

        return switch (shapeName) {
            case "circle" -> new Cricle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            default -> null;
        };

    }

}
