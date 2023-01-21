package Kacper_Milnikel.devices;

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
}
