package creational.a_factory;

public class Client {

    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();

    }
}
