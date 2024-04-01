package creational.b_abstract_factory;

public class ColorFactory implements ColorFactoryInterface {

    public Color getColor(String colorName) {

        return switch (colorName) {
            case "red" -> new Red();
            case "blue" -> new Blue();
            case "green" -> new Green();
            default -> null;
        };

    }


}
