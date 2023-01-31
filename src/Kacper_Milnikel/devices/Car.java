package Kacper_Milnikel.devices;

import Kacper_Milnikel.creatures.Human;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device{
    //zad2
    public String Color;
    public Double Value;
    public int Millage;
    private List<Human> getOwners;//zad11

    public Car(String producer, String model, int yearOfProduction, int Millage, String color, Double value) {
        super(producer, model, yearOfProduction);//zad7
        this.Color = color;
        this.Value = value;
        this.getOwners = new ArrayList<>();//zad11
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
        if(!seller.hasACar(this) && seller != getOwner()) {
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
            getOwners.add(buyer);//zad11
            System.out.println("sukces");
        }
    }

    //zad10
    public abstract void refuel();

    //zad12
    public Human getOwner() {
        return getOwners.get(getOwners.size() - 1);
    }

    //zad12
    public ArrayList<Human> getOwners() {
        return (ArrayList<Human>) getOwners;
    }

    //zad12
    public boolean wasOwner(Human human) {
        boolean wasOwning = false;
        for(int i = 0; i < getOwners.size(); i++) {
            if(human == getOwners.get(i)) {
                wasOwning = true;
            }
        }
        return wasOwning;
    }

    //zad12
    public void wasSoldBy(Human seller, Human buyer) {
        for(int i = 0; i < getOwners.size(); i++) {
            if(getOwners.get(i) == seller && getOwners.get(i + 1) == buyer) {
                System.out.println(seller.FirstName + " " + seller.LastName + " sprzedał samochód " + this.Producer + " " + this.Model + " do " + buyer.FirstName + " " + buyer.LastName );
                break;
            } else {
                System.out.println(seller.FirstName + " " + seller.LastName + " nie sprzedał samochód " + this.Producer + " " + this.Model + " do " + buyer.FirstName + " " + buyer.LastName);
            }
        }
    }

    //zad12
    public void timesSold() {
        int timesSold = getOwners.size() % 2;
        if(timesSold == 0) {
            timesSold = getOwners.size() / 2;
            System.out.println("samochod zostal sprzedany " + timesSold + " razy");
        } else if(timesSold != 0){
            timesSold = getOwners.size() - 1;
            System.out.println("samochod zostal sprzedany " + timesSold + " razy");

        }
    }
}