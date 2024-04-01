package creational.e_prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        prototypeRegistry.createRegistry();

        Employee e1 = (Employee) prototypeRegistry.getObject("employee");
        Employee e2 = (Employee) prototypeRegistry.getObject("employee");

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}
