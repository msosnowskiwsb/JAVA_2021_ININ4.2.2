package pl.gda.wsb.creatures;

import pl.gda.wsb.devices.Car;

import java.util.Date;
import java.util.Objects;

public class Human extends Animal {
    String firstName;
    String lastName;
    String position;
    Double salary;
    Double cash;
    Animal pet;
    private Car car;
    public static final String HUMAN_SPECIES = "homo sapiens";

    public Human(String firstName, String lastName, String position, Double salary, Double cash) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.cash = cash;
    }

    public Double getSalary() {
        System.out.println(new Date() + ": Pobrano informację o wysokości zarobków - " + this.lastName + "(" + this.position +")");
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (salary < 0) System.out.println("Nikt nie będzie dokładał do pracy!");
        else {
            System.out.println("Dane o podwyżce wysłane do księgowości.");
            System.out.println("Aneks do odebrania u pani Hani.");
            System.out.println("Info do ZUS i US przekazane.");
            this.salary = newSalary;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasCar (Car newCar){
        if (this.car == newCar){
            return true;
        }
        return false;
    }

    public void removeCar(){
        this.car = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Double.compare(human.salary, salary) == 0 &&
                Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(position, human.position) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, salary, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", cash=" + cash +
                ", pet=" + pet +
                ", car=" + car +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", DEFAULT_MOUSE_WEIGHT=" + DEFAULT_MOUSE_WEIGHT +
                ", DEFAULT_LION_WEIGHT=" + DEFAULT_LION_WEIGHT +
                ", DEFAULT_WEIGHT=" + DEFAULT_WEIGHT +
                '}';
    }
}
