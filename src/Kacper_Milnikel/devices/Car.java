package Kacper_Milnikel.devices;

import Kacper_Milnikel.creatures.Human;

public class Car extends Device{
    //zad2
    public String Color;
    public Double Value;
    public int Millage;

    public Car(String producer, String model, int yearOfProduction, int Millage, String color, Double value) {
        super(producer, model, yearOfProduction);//zad7
        this.Color = color;
        this.Value = value;
    }

    //zad6
    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Producer='" + Producer + '\'' +
                ", ManufactureYear=" + yearOfProduction +
                ", Color='" + Color + '\'' +
                ", Value=" + Value +
                ", Millage=" + Millage +
                '}';
    }

    //zad7
    @Override
    public void TurnOn() {
        System.out.println("Wkladam kluczyk");
        System.out.println("Przekręcam za zaplon");
        System.out.println("Czekam az zgasna kontrolki");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Przekrecam do konca");
        System.out.println("Trzymam");
        System.out.println("Trzymam");
        System.out.println("Dziala!");
    }

    //zad8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
//        try {
//            super.sell(seller, buyer, price);
//            buyer.setCar(this);
//            if (seller.getCar() == this) {
//                seller.setCar(null);
//            }
//        } catch (Exception e) {
//            System.out.println("nie da rady");
//            throw e;
//        }
        if(!seller.hasACar(this)) {
            throw new Exception("sprzedawca nie ma tego auta");
        } else if(!buyer.canHaveMoreCars()) {
            throw new Exception("kupujacy nie moze miec wiecej aut");
        }else  if(!buyer.cantAfford(price)) {
            throw new Exception("kupujacy nie ma dosc pieniedzy");
        } else {
            seller.removeCar(this);
            buyer.addCar(this);
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("sukces");
        }


    }

}
