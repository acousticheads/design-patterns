package creational.d_builder;

public class ComputerBuilder {

    private Computer computer = new Computer();

    public ComputerBuilder setCpuCount(int cpuCount) {
        computer.setCpuCount(cpuCount);
        return this;
    }

    public ComputerBuilder setRam(int setRam) {
        computer.setRamSize(setRam);
        return this;
    }

    public  Computer build() {
        return computer;
    }



}
