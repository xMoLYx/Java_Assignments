package Kacper_Milnikel.creatures;

import Kacper_Milnikel.Saleable;

public class Animal implements Saleable {
    //zad1
    public final String species;
    private Double weight;
    Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.alive = true;


        if (this.species == "Dog"){
            this.weight = 10.0;
        } else if (this.species == "Cat"){
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }
    }

    public void feed(){
        if (!this.alive && weight <= 0){
            System.out.println("Nie karmi się martwych zwierząt");
        } else {
            this.weight += 0.5;
            System.out.println("Aktualna waga to: " + this.weight);
        }
    }

    public void TakeForAWalk(){
        if (!this.alive){
            System.out.println("Nie wyprowadza się martwych zwierząt");
        } else {
            this.weight -= 1.0;
            System.out.println("Aktualna waga to: " + this.weight);
            if (this.weight <= 0) {
                this.alive = false;
                System.out.println("Nie wyprowadza się martwych zwierząt");
            }
        }
    }

    //zad6
    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }

    //zad8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -=price;
            buyer.pet = this;
            if(seller.pet == this){
                seller.pet = null;
            }
            System.out.println(seller.FirstName + " " + seller.Lastname + " sprzedal " + this.toString() + " kupujacemu " + buyer.FirstName + " " + buyer.Lastname + " za cene " + price);
        } else {
            throw new Exception("Sorry mordo, nie masz kwitu");
        }
    }
}
