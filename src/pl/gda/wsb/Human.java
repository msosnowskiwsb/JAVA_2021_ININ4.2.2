package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Date;
import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    String position;
    Double salary;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
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
        return "First name: " + firstName +
                ", lastName: " + lastName +
                ", position: " + position +
                ", salary=" + salary;
    }
}
