package Kacper_Milnikel.creatures;
//zad9
public class FarmAnimal extends Animal implements Edible{
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Zwierze jest jadalne!");
    }

    @Override
    public void feed(Double FoodWeight) {
        System.out.println("Zwierze zostało nakarmione jedzieniem o wadze " + FoodWeight + " kg");
    }

    @Override
    public void feed() {
        System.out.println("Zwierze hodowlane zostało nakarmione");
    }
}
