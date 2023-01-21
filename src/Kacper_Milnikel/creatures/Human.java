package Kacper_Milnikel.creatures;

import Kacper_Milnikel.devices.Car;

import java.time.LocalDateTime;

public class Human {
    String FristName;//zad1&2
    String Lastname;//zad1&2
    int Age;//zad1&2
    Animal pet; //zad1
    private Car car;//zad1&2&5
    private Double Salary;//zad3&4
    private LocalDateTime lastSalaryCheck;//zad3&4

    //zad1&2
    public Human(String fristName, String lastname, int age) {
        Animal pet;
        Car car;
        FristName = fristName;
        Lastname = lastname;
        Age = age;
        this.Salary = 2700.0;
    }
    //zad3&4
    public double getSalary() {
        lastSalaryCheck = LocalDateTime.now();
        System.out.println("Last salary check was performed on " + lastSalaryCheck + " and the salary was " + Salary);
        return Salary;
    }

    void setSalary(Double salary) {
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
    public Car getCar(Car car) {
        return this.car;
    }

    public void setCar(Car car) {
        if (Salary > car.Value){
            System.out.println("Udalo sie kupic auto za gotowke!");
            this.car = car;
        } else if (Salary > car.Value/12){
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
                "FristName='" + FristName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Age=" + Age +
                ", pet=" + pet +
                ", car=" + car +
                ", Salary=" + Salary +
                ", lastSalaryCheck=" + lastSalaryCheck +
                '}';
    }
}
