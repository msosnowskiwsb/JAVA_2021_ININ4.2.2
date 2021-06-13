package pl.gda.wsb.creatures;

import pl.gda.wsb.Saleable;
import pl.gda.wsb.creatures.Human;

public class Animal implements Saleable {
    final String species;
    String name;
    private Double weight;

    final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    final Double DEFAULT_LION_WEIGHT = 123.0;
    final Double DEFAULT_WEIGHT = 50.0;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        if (species.equals("mouse")) {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species.equals("lion")) {
            this.weight = DEFAULT_LION_WEIGHT;
        } else this.weight = DEFAULT_WEIGHT;
    }

    public Animal(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void feed() {
        if (weight <= 0) {
            System.out.println(this.species + " --> To late :(");
        } else {
            weight++;
            System.out.println(this.species + " --> thx :) my weight is now " + this.weight);
        }
    }

    public void takeForAWalk() {
        weight--;
        if (weight <= 0) {
            System.out.println(this.species + " --> No! You can't go for a walk with a dead animal");
        } else if (weight <= 3) {
            System.out.println(this.species + " --> Yeaaah :) but I am hungry...");
        } else {
            System.out.println(this.species + " --> Thx for a walk bro, my weight is now: " + this.weight);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", DEFAULT_MOUSE_WEIGHT=" + DEFAULT_MOUSE_WEIGHT +
                ", DEFAULT_LION_WEIGHT=" + DEFAULT_LION_WEIGHT +
                ", DEFAULT_WEIGHT=" + DEFAULT_WEIGHT +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("Nie można sprzedawać ludzi!");
        } else {
            if (buyer.getCash() >= price) {
                if (seller.pet == this) {
                    buyer.pet = this;
                    seller.pet = null;
                    buyer.setCash(buyer.getCash() - price);
                    seller.setCash(seller.getCash() + price);
                } else {
                    throw new Exception("Klient nie ma tego zwierzęcia");
                }
            } else {
                throw new Exception("Klient nie ma tyle pięniędzy.");
            }
        }
    }
}
