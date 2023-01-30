package Kacper_Milnikel.devices;
//zad10
public class Diesel extends Car{

    public Diesel(String producer, String model, int yearOfProduction, int Millage, String color, Double value) {
        super(producer, model, yearOfProduction, Millage, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Otweiram wlew");
        System.out.println("Wkladam pistolet");
        System.out.println("Naciskam spust");
        System.out.println("zalewam paliwo");
        System.out.println("zalewam paliwo");
        System.out.println("zalewam paliwo");
        System.out.println("zalewam paliwo");
        System.out.println("zalewam paliwo");
        System.out.println("gotowe!");
    }
}
