package Kacper_Milnikel.creatures;

import Kacper_Milnikel.Saleable;
import Kacper_Milnikel.devices.Car;

import Kacper_Milnikel.devices.Phone;

import java.time.LocalDateTime;

public class Human implements Saleable {
    public String FirstName;//zad1&2
    public String Lastname;//zad1&2
    int Age;//zad1&2
    Animal pet; //zad1
    private Car car;//zad1&2&5
    private Double Salary;//zad3&4
    private LocalDateTime lastSalaryCheck;//zad3&4
    public Phone phone;//zad7
    public Double cash;//zad8

    //zad1&2
    public Human(String firstName, String lastname, int age) {
        this.pet = pet;
        this.car = car;
        this.FirstName = firstName;
        this.Lastname = lastname;
        this.Age = age;
        this.Salary = 2700.0;
        this.phone = phone;
        this.cash = cash;
    }
    //zad3&4
    public double getSalary() {
        lastSalaryCheck = LocalDateTime.now();
        System.out.println("Ostatnie sprawdzenie wyplaty nastapilo " + lastSalaryCheck + " i wynosila ona " + Salary);
        return Salary;
    }

    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego ");
            System.out.println("Proszę odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmanie wypłaty i nie ma sensu ukrywać dochodu");
            this.Salary = Salary;
        } else if (salary < 0) {
            System.out.println("Błąd! Wynagordzenie nie może być ujemne!");
        }
    }
    //zad5
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (Salary > car.Value) {
            System.out.println("Udalo sie kupic auto za gotowke!");
            this.car = car;
        } else if (Salary > car.Value/12) {
            System.out.println("Udalo sie kupic na kredyt!");
            this.car = car;
        } else {
            System.out.println("zapisz sie na studia i znajdz nowa robote albo idz po podwyzke");
        }
    }

    //zad6
    @Override
    public String toString() {
        return "Human{" +
                "FristName='" + FirstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Age=" + Age +
                ", pet=" + pet +
                ", car=" + car +
                ", Salary=" + Salary +
                ", lastSalaryCheck=" + lastSalaryCheck +
                '}';
    }

    //zad8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new Exception("Oszalales?");
    }
}
