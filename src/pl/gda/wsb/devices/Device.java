package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;
import pl.gda.wsb.Saleable;

public abstract class Device implements Saleable {
    final Producer producer;
    final String model;
    final Integer yearOfProduction;

    public Device(Producer producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
