package Kacper_Milnikel.devices;

import Kacper_Milnikel.Saleable;
import Kacper_Milnikel.creatures.Human;

//zad7
public abstract class Device implements Saleable {
    public final String Model;
    public final String Producer;
    public final int yearOfProduction;
    public Double Value;

    public Device(String model, String producer, int yearOfProduction) {
        this.Model = model;
        this.Producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.Value = 0.0;
    }

    @Override
    public String toString() {
        return "Device{" +
                "Model='" + Model + '\'' +
                ", Producer='" + Producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void TurnOn();

    //zad8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -= price;
            System.out.println(seller.FirstName + " " + seller.LastName + " sprzedal " + this.toString() + " kupujacemu " + buyer.FirstName + " " + buyer.LastName + " za cene " + price);
        } else {
            throw new Exception("Sorry mordo, nie masz kwitu");
        }
    }
}
