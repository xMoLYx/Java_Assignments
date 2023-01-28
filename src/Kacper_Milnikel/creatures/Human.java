package Kacper_Milnikel.creatures;

import Kacper_Milnikel.Saleable;
import Kacper_Milnikel.devices.Car;

import Kacper_Milnikel.devices.Phone;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Human extends Animal implements Saleable {
    public static final int DEFAULT_GARAGE_SIZE = 2;
    public String FirstName;//zad1&2
    public String LastName;//zad1&2
    int Age;//zad1&2
    public Animal pet; //zad1
    public Car[] garage = new Car[2];
    private Double Salary;//zad3&4
    private LocalDateTime lastSalaryCheck;//zad3&4
    public Phone phone;//zad7
    public Double cash;//zad8

    //zad1&2
    public Human(String FirstName, String LastName, int Age) {
        super("Homo Sapiens");
        this.pet = pet;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Salary = 2700.0;
        this.phone = phone;
        this.cash = cash;
    }

    public Human(int GarageSize) {
        super("Homo Sapiens");
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Salary = 2700.0;
        this.phone = phone;
        this.cash = cash;
        this.garage = new Car[GarageSize];
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
    public Car getCar(int ParkingLotNumber) {
        return this.garage[ParkingLotNumber];
    }


    public void setCar(Car newCar, Integer parkingLotNumber) {
        if (parkingLotNumber >= this.garage.length) {
            System.out.println("sorry, nie mamy tak dużego garażu");
        } else if (parkingLotNumber < 0) {
            System.out.println("chyba coś ci na łeb upadło");
        } else if (this.garage[parkingLotNumber] != null) {
            System.out.println("sorry miejsce zajęte");
        } else {
            this.garage[parkingLotNumber] = newCar;
        }
    }

    public Double GetValueOfALlCars() {
        Double ValueOfCars = 0.0;
        for(int i =0; i < this.garage.length; i++) {
            if(this.garage[i] != null) {
                ValueOfCars += this.garage[i].Value;
            }
        }
        return ValueOfCars;
    }

    @Override
    public String toString() {
        return "Human{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                ", pet=" + pet +
                ", garage=" + Arrays.toString(garage) +
                ", Salary=" + Salary +
                ", lastSalaryCheck=" + lastSalaryCheck +
                ", phone=" + phone +
                ", cash=" + cash +
                '}';
    }

    //zad8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new Exception("Oszalales?");
    }

    //ZAD9
    public void feed() {

        System.out.println("mmm Szyneczka");
    }

    public boolean canHaveMoreCars() {
        boolean canHaveMoreCars = true;
        if (this.garage.length == 0) {
            canHaveMoreCars = false;
        }
        return canHaveMoreCars();
    }

    public boolean hasACar(Car car) {
        boolean hasCar = false;
        for(int i = 0; i <this.garage.length; i++) {
            if(this.garage[i] == car) {
                hasCar = true;
            }
        }
        return hasCar;
    }

    public boolean hasLessCashThanPrice(Car car) {
        boolean hasLessCashThanPrice = false;
        if (this.cash < this.sell.;) {
            hasLessCashThanPrice = true;
        }
        return hasLessCashThanPrice;
    }

//    public void addCash(Car car) {
//        this.cash += this.set;
//    }
//
//    public void removeCash(Car car) {
//    }
//
//    public void removeMoney(Double price) {
//    }
//
//    public void addMoney(Double price) {
//    }
//
//    public void removeCar(Car car) {
//        Car RemoveCar = null;
//        for(int i = 0; i <this.garage.length; i++) {
//            if(this.garage[i] == car) {
//                this.garage[i] = RemoveCar;
//            }
//        }
//    }
//
//    public void addCar(Car car) {
//        Car addCar = car;
//        for(int i = 0; i <this.garage.length; i++) {
//            if(this.garage[i] == addCar) {
//                this.garage[i] = addCar;
//            }
//        }
//    }
}
