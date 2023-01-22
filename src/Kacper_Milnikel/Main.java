package Kacper_Milnikel;

import Kacper_Milnikel.creatures.Animal;
import Kacper_Milnikel.devices.Car;
import Kacper_Milnikel.creatures.Human;
import Kacper_Milnikel.devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        //zad1
        Animal Sparky = new Animal("Dog") {
            @Override
            public void feed(Double FoodWeight) {

            }
        };
        Sparky.name = "Sparky";

//        Sparky.feed();
//        Sparky.feed();
//        Sparky.feed();
//        Sparky.feed();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();
//        Sparky.TakeForAWalk();

        //zad2
        Human me = new Human("Kacper", "Milnikel", 21);
        Car Passat = new Car("Volkswagen", "Passat", 1996, 342512,"Red", 1500.0);

        me.setCar(Passat);

        //zad6
        Car Passat1 = new Car("Volkswagen", "Passat", 1996, 342512,"Red", 1500.0);

        System.out.println(Passat == Passat1);
        System.out.println(Passat.equals(Passat1));
        System.out.println(Passat);
        System.out.println(me);
        System.out.println(Sparky);

        //zad7
        Phone Kacper = new Phone("Apple", "Iphone 11", 2019, 6.1);

        Kacper.OS="IOS";

        me.phone = Kacper;
        Kacper.TurnOn();

        System.out.println(me.phone);

        Passat.TurnOn();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //zad8
        Human Agata = new Human("Agata", "Nijak", 18);

        me.cash = 300.0;
        Agata.cash = 5200.0;

        //Passat1.sell(me, Agata, 1500.0);

        me.phone = Kacper;
        me.pet = Sparky;

        //Kacper.sell(me, Agata, 3000.0);
        System.out.println(Agata.cash);

        System.out.println(Sparky);

        //zad9
        me.pet.feed(3.5);
        me.feed();

        Kacper.installAnnApp("Facebook");
        Kacper.installAnnApp("Instagram", "13.2");
        Kacper.installAnnApp("YouTube", "18.2", "google.com");

        List<String> apps = new ArrayList<>();
        apps.add("Twitter");
        apps.add("Snapchat");
        apps.add("Zalando");


        Car Audi = new Car("Audi", "A4", 2003, 270000, "Gray", 20000.0);
        Car Golf = new Car("Volkswagen", "Golf", 2001, 320000, "Gray", 8000.0);

        me.setCar(Audi, 1);
        me.setCar(Golf, 0);

        me.GetValueOfALlCars();

        Audi.sell(me, Agata, 300.0);
    }
}
