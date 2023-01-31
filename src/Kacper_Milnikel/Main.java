package Kacper_Milnikel;

import Kacper_Milnikel.creatures.Animal;
import Kacper_Milnikel.devices.*;
import Kacper_Milnikel.creatures.Human;

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

        Sparky.feed();
        Sparky.feed();
        Sparky.feed();
        Sparky.feed();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();
        Sparky.TakeForAWalk();

        //zad2
        Human me = new Human("Kacper", "Milnikel", 21);

        Diesel Passat = new Diesel("Volkswagen", "Passat", 1996, 342512,"Red", 1500.0);

        me.setCar(Passat, 2);

        //zad6
        LPG Passat1 = new LPG("Volkswagen", "Passat", 1992, 342512,"Red", 2500.0);

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

        Agata.garage = new Car[2];
        Agata.addCar(Passat);
        Agata.setCar(Passat1,1);
        System.out.println(Agata.getCar(1));

        me.cash = 2000.0;
        Agata.cash = 5200.0;


        Sparky.sellAnimal(me,Agata, 100.0);
        Sparky.sellAnimal(Agata,me, 12130.0);
        Sparky.sellAnimal(Agata,me, 12130.0);


        Passat1.sell(Agata, me, 1500.0);

        me.phone = Kacper;
        me.pet = Sparky;

        Kacper.sell(me, Agata, 3000.0);
        System.out.println(Agata.cash);
        System.out.println(Agata.phone);

        System.out.println(Sparky);

        //zad9
        me.pet.feed(3.5);
        me.feed();

        Kacper.installAnnApp("Facebook");
        Kacper.installAnnApp("Instagram", "13.2");
        Kacper.installAnnApp("YouTube", "18.2", "google.com");

        //zad10
        List<String> apps = new ArrayList<>();
        apps.add("Twitter");
        apps.add("Snapchat");
        apps.add("Zalando");


        Electric Audi = new Electric("Audi", "A4", 2003, 270000, "Gray", 20000.0);
        Diesel Golf = new Diesel("Volkswagen", "Golf", 2001, 320000, "Gray", 8000.0);

        Audi.refuel();

        //zad11
        System.out.println(me.garage.length);
        Passat.sell(Agata, me, 300.0);
        Human michal = new Human(5);
        michal.FirstName = "Michal";
        michal.cash = 5000.0;
        System.out.println(michal.garage.length);

        System.out.println(me.getCar(0));
        System.out.println(me.getCar(1));
        Passat.sell(me,michal,1000.0);
        me.setCar(Audi,1);

        System.out.println(me.cash + " - ja, przed sprzedażą");
        System.out.println(michal.cash + " - Michal, przed sprzedażą");
        Audi.sell(me, michal, 100.0);
        Audi.sell(michal, Agata, 20.0);
        System.out.println(Audi.getOwners());

        System.out.println(me.cash + " - ja, po sprzedaży");
        System.out.println(michal.cash + " - Michal, po sprzedaży");
        michal.setCar(Passat1, 2);


        System.out.println(michal.GetValueOfALlCars());

        System.out.println(michal.getCar(0));
        System.out.println(michal.getCar(1));
        System.out.println(michal.getCar(2));
        michal.sortCars();

        System.out.println("posortowane");
        System.out.println(michal.getCar(0));
        System.out.println(michal.getCar(1));
        System.out.println(michal.getCar(2));
        System.out.println(michal.getCar(3));
        System.out.println(michal.getCar(4));



        Audi.refuel();

        //zad12
        System.out.println(Audi.getOwners());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(Passat.getOwners());

        Audi.sell(Agata, michal, 20.0);
        Audi.sell(michal, Agata, 10.0);

        System.out.println(Audi.getOwners());
        System.out.println(Passat1.getOwners());

        Passat1.sell(michal, me, 10.0);
        System.out.println(Agata.garage.length);
        System.out.println(Agata.getCar(0));
        System.out.println(Agata.getCar(1));

        Passat1.sell(me, Agata, 2.0);
        Passat1.sell(Agata,michal, 2.0);

        System.out.println(Passat1.getOwners());
        me.setCar(Audi, 1);

        System.out.println(Audi.wasOwner(Agata));
        Passat1.wasSoldBy(me, Agata);
        System.out.println(Passat1.getOwners());

        Passat1.timesSold();

        //zad13
        Application puzzleGarden = new Application("Sudoku", 1.0, 0.0);
        Application heroes = new Application("Portal II", 3.0, 30.0);
        Application vip = new Application("Pokemon Go", 1.0,300000.0);
        Kacper.isInstalled(puzzleGarden);
        Kacper.installNewApp(puzzleGarden,me);
        Kacper.installNewApp(heroes,me);
        Kacper.isInstalled(heroes);
        Kacper.isInstalled("Heroes III");
        Kacper.installNewApp(vip,me);
        Kacper.allFreeApps();
        Kacper.howManyAppsIsInstalled();
        Kacper.sortNameApps();
        Kacper.sortViaPrice();
        System.out.println(Kacper.appsCollection);
    }
}
