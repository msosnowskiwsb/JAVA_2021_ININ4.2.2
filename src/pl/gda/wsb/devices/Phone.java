package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Phone extends Device{
    double screenSize;

    public Phone(Producer producer, String model, Integer yearOFProduction, double screenSize) {
        super(producer,model,yearOFProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon został włączony.");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
