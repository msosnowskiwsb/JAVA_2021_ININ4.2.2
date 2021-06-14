package pl.gda.wsb.devices;

import pl.gda.wsb.creatures.Human;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(!seller.hasCar(this)){
            throw new Exception("Klient nie ma tego auta");
        }
        if (buyer.getCash() < price){
            throw new Exception("Klient nie ma tyle szmalu");
        }

        buyer.setCar(this);
        seller.removeCar();
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);

        System.out.println("Sprzedano");

        System.out.println("Sprzedano auto: " + this.producer + " " + this.model + ". Kupił " + buyer.getLastName() + " od " + seller.getLastName() + " za " + price + "." );
    }
}