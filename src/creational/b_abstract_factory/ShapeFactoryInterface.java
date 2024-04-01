package creational.b_abstract_factory;

public interface ShapeFactoryInterface extends Factory {

    public Shape getShape(String shapeName);
}
