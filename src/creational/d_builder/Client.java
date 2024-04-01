package creational.d_builder;

public class Client {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder()
                .setCpuCount(4)
                .setRam(16)
                .build();

        System.out.println(computer.getCpuCount());

    }
}
