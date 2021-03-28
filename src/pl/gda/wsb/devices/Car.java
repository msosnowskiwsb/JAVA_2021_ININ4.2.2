package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car {
    final Producer producer;
    final String model;
    final Integer yearOfProduction;
    Double engine;
    String color;

    public Car(Producer producer, String model, Integer yearOfProduction, Double engine, String color) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
        this.color = color;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
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