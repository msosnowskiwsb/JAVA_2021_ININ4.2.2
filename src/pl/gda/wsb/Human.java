package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    String position;
    double salary;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getCar() {
        return car;
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
