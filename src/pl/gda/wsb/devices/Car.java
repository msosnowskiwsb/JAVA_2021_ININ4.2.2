package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car extends Device{
    Double engine;
    String color;
    private Double value;

    public Car(Producer producer, String model, Integer yearOfProduction, Double engine, String color, Double value) {
        super(producer, model, yearOfProduction);
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
    public void turnOn() {
        System.out.println("Samochód został włączony.");
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