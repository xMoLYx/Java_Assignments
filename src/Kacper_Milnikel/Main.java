package Kacper_Milnikel;

import Kacper_Milnikel.creatures.Animal;
import Kacper_Milnikel.devices.Car;
import Kacper_Milnikel.creatures.Human;
import Kacper_Milnikel.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        //zad1
        Animal Sparky = new Animal("Dog");
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

        Passat1.sell(me, Agata, 1500.0);

        me.phone = Kacper;

        Kacper.sell(me, Agata, 3000.0);
        System.out.println(Agata.cash);
    }
}
