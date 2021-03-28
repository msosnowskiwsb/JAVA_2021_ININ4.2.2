package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human("Jan","Nowak","Java Developer",12500.0);
        Human human2 = new Human("Janusz","Kowalski","Automation Tester",6900.0);
        Human human3 = new Human("Piotr","Nowy","Support man",4600.0);
        Human human4 = new Human("Piotr","Nowy","Support man",4600.0);

        Animal animal1 = new Animal("mouse","Jerry");
        Animal animal2 = new Animal("lion","Mufsa");

        Phone phone1 = new Phone("SAMSUNG","S10",6.9);
        Phone phone2 = new Phone("NOKIA","5.1",7.5);

        Car car1 = new Car(Producer.KIA, "CARRENS",2017,1.8,"black");

        System.out.println(human1);
        System.out.println(human1.firstName);

        Animal animalWithMaxWeight = animal1.getWeight() > animal2.getWeight() ? animal1 : animal2;
        System.out.println("The heaviest animal is " + animalWithMaxWeight.name + ". Its weight is: " + animalWithMaxWeight.getWeight() + " kg.");

        System.out.println("\n------------------------\n");

        ArrayList<Human> humanslist = new ArrayList<>();
        humanslist.add(human1);
        humanslist.add(human2);

        for (Human human : humanslist){
            System.out.println(human);
        }

        System.out.println("\n------------------------\n");

        human1.pet = animal1;
        System.out.println(human1.firstName + " have a pet: " + human1.pet.species + ", his name: " + human1.pet.name);

        animal2.feed();
        animal2.takeForAWalk();

        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();

        System.out.println("\n---------------------------------\n");

        human1.car = car1;
        System.out.println(human1.firstName + " have a car: " + human1.car.getProducer() + " " + human1.car.getModel() + " and have a pet " + human1.pet.name + " (" + human1.pet.species + ")");

        System.out.println("\n---------------------------------\n");

        if (human3.equals(human4)) System.out.println("Wynik porównania: TRUE");
        else System.out.println("Wynik porównania: FALSE");

        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(phone1);
        System.out.println(car1);

        System.out.println("\n---------------------------------\n");

        human1.setSalary(14700.0);
        human1.setSalary(-700.0);
        System.out.println("Salary: " + human1.getSalary());

    }
}
