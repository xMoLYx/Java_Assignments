package Kacper_Milnikel.devices;
//zad10
public class LPG extends Car{

    public LPG(String producer, String model, int yearOfProduction, int Millage, String color, Double value) {
        super(producer, model, yearOfProduction, Millage, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("odkrecam korek");
        System.out.println("podlaczam przejsciowke");
        System.out.println("klikam przycisk");
        System.out.println("uzupelanianie gazu");
        System.out.println("uzupelanianie gazu");
        System.out.println("uzupelanianie gazu");
        System.out.println("uzupelanianie gazu");
        System.out.println("gotowe!");
    }
}
