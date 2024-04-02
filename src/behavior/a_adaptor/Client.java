package behavior.a_adaptor;

public class Client {

    public static void main(String[] args) {

        TemperatureAdaptorImpl temperatureAdaptor = new TemperatureAdaptorImpl(new TemperatureSensor());
        System.out.println(temperatureAdaptor.getTempInDegree());

    }
}
