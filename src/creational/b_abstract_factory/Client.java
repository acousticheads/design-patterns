package creational.b_abstract_factory;

public class Client {

    public static void main(String[] args) {

        ShapeFactoryInterface shapeFactory = (ShapeFactoryInterface) AbstractFactory.getFactory("shape");
        Shape shape = shapeFactory.getShape("square");
        shape.draw();

    }
}
