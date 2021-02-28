package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human("Jan","Nowak","Java Developer",12500.0);
        Human human2 = new Human("Janusz","Kowalski","Automation Tester",6900.0);

        Animal animal1 = new Animal("mouse","Jerry",0.8);
        Animal animal2 = new Animal("lion","Mufsa",123.0);

        Phone phone1 = new Phone("SAMSUNG","S10",6.9);
        Phone phone2 = new Phone("NOKIA","5.1",7.5);

        System.out.println(human1);
        System.out.println(human1.firstName);

        Animal animalWithMaxWeight = animal1.weight > animal2.weight ? animal1 : animal2;
        System.out.println("The heaviest animal is " + animalWithMaxWeight.name + ". Its weight is: " + animalWithMaxWeight.weight + " kg.");

        System.out.println("\n------------------------\n");

        ArrayList<Human> humanslist = new ArrayList<>();
        humanslist.add(human1);
        humanslist.add(human2);

        for (Human human : humanslist){
            System.out.println(human.firstName);
        }

    }
}
