package Kacper_Milnikel.devices;
//zad10
public class Electric extends Car {

    public Electric(String producer, String model, int yearOfProduction, int Millage, String color, Double value) {
        super(producer, model, yearOfProduction, Millage, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Podłączam do ładowarki");
        System.out.println("ładuje");
        System.out.println("20%");
        System.out.println("50%");
        System.out.println("80%");
        System.out.println("100%");
        System.out.println("Gotowe!");
    }
}
