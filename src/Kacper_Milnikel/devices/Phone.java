package Kacper_Milnikel.devices;

import Kacper_Milnikel.creatures.Human;

//zad7
public class Phone extends Device{
    final Double ScreeenSize;
    public String OS;

    public Phone(String producer, String model, int yearOfProduction, Double screeenSize) {
        super(producer, model, yearOfProduction);
        this.ScreeenSize = screeenSize;
        this.OS = OS;
    }


    public String toString() {
        return "Kacper_Milnikel.device.Phone{" +
                "screeenSize=" + ScreeenSize +
                ", OS='" + OS + '\'' +
                ", producer='" + Producer + '\'' +
                ", model='" + Model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void TurnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("widze logo");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("dziala!");
    }

    //zad8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        try {
            super.sell(seller, buyer, price);
            buyer.phone = this;
            if (seller.phone == this) {
                seller.phone = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
