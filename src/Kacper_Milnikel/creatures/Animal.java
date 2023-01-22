package Kacper_Milnikel.creatures;

import Kacper_Milnikel.Saleable;

public abstract class Animal implements Saleable, Feedable{
    //zad1
    public final String species;
    public String name;
    private Double weight;
    Boolean alive;
    public final static Double DEFAULT_FOOD_WEIGHT = 0.5;

    public Animal(String species) {
        this.species = species;
        this.alive = true;
        this.name = name;


        if (this.species == "Dog"){
            this.weight = 10.0;
        } else if (this.species == "Cat"){
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }
    }

    public void feed(){
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    @Override
    public void feed(Double FoodWeight) {
        if (!this.alive && weight <= 0){
            System.out.println("Nie karmi się martwych zwierząt");
        } else {
            this.weight += FoodWeight;
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
                ", name='" + name + '\'' +
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
            System.out.println(seller.FirstName + " " + seller.LastName + " sprzedal " + this.toString() + " kupujacemu " + buyer.FirstName + " " + buyer.LastName + " za cene " + price);
        } else {
            throw new Exception("Sorry mordo, nie masz kwitu");
        }
    }


}
