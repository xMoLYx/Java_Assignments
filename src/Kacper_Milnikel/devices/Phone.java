package Kacper_Milnikel.devices;

import Kacper_Milnikel.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//zad7
public class Phone extends Device{
    final Double ScreeenSize;
    public String OS;
    private static final String DEFAULT_APP_VERSION = "Latest Version";
    private static final String DEFAULT_SERVER_NAME = "wsb.apps.pl";
    private static final String DEFAULT_PROTOCOL = "HTTPS";

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

    public void installAnnApp(String AppName) {
        this.installAnnApp(AppName, DEFAULT_APP_VERSION);
    }

    public void installAnnApp(String AppName, String Version) {
        this.installAnnApp(AppName, Version, DEFAULT_SERVER_NAME);
    }

    public void installAnnApp(String AppName, String Version, String ServerAddress) {
        System.out.println("sprawdzam dostepne miejsce");
        System.out.println("pobieram " + AppName + " w wersji " + Version + " z serwera " + ServerAddress);
        System.out.println("instlauje");
        System.out.println("gotowe");
    }

    public void installAnnApp(List<String> ListApps) {
        for (String AppName : ListApps) {
            this.installAnnApp(AppName);
        }
    }
}
