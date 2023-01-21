package Kacper_Milnikel;

public class Car {
    //zad2
    final public String Model;
    final public String Producer;
    final public int ManufactureYear;
    public String Color;
    public Double Value;
    public int Millage;

    public Car(String producer, String model, int manufactureYear, int Millage, String color, Double value) {
        this.Model = model;
        this.Producer = producer;
        this.ManufactureYear = manufactureYear;
        this.Color = color;
        this.Value = value;
    }
    //zad2
}
