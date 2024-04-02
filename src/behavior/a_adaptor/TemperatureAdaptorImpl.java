package behavior.a_adaptor;

public class TemperatureAdaptorImpl implements TemperatureAdaptor {

    TemperatureSensor temperatureSensor;

    public TemperatureAdaptorImpl(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    @Override
    public int getTempInDegree() {
        return temperatureSensor.getTempInF()*12;
    }

    @Override
    public int getTempInFahrenheit() {
        return temperatureSensor.getTempInF();
    }
}
