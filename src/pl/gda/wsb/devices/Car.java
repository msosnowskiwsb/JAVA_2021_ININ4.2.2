package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car {
    final Producer producer;
    final String model;
    final Integer yearOfProduction;
    Double engine;
    String color;
    private Double value;

    public Car(Producer producer, String model, Integer yearOfProduction, Double engine, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
        this.color = color;
        this.value = value;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}