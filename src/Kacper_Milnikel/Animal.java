package Kacper_Milnikel;

public class Animal {
    //zad1
    public final String species;
    private Double weight;
    public boolean alive;

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
    //koniec zad1
}
