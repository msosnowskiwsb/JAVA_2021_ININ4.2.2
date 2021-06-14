package pl.gda.wsb.devices;

import pl.gda.wsb.creatures.Human;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() >= price) {
            if (seller.getPhone() == this){
                buyer.setPhone(this);
                seller.setPhone(null);
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("\nSprzedano telefon: " + this.producer + " " + this.model + ". Kupił " + buyer.getLastName() + " od " + seller.getLastName() + " za " + price + ".");
                System.out.println(seller.getLastName() + " ma teraz " + seller.getCash() + ", a " + buyer.getLastName() + " ma " + buyer.getCash() + ".");

                System.out.println(seller.getLastName() + " ma auto: " + seller.getPhone());
                System.out.println(buyer.getLastName() + " ma auto: " + buyer.getPhone());
            } else {
                throw new Exception("Klient nie ma tego telefonu!");
            }
        } else {
            throw new Exception("Klient nie ma tyle siana!");
        }
    }
}
