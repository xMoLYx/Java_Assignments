package Kacper_Milnikel;

import Kacper_Milnikel.creatures.Animal;
import Kacper_Milnikel.devices.Car;
import Kacper_Milnikel.creatures.Human;

public class Main {

    public static void main(String[] args) {
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

        me.getCar(Passat);

        //zad6
        Car Passat1 = new Car("Volkswagen", "Passat", 1996, 342512,"Red", 1500.0);

        System.out.println(Passat == Passat1);
        System.out.println(Passat.equals(Passat1));
        System.out.println(Passat);
        System.out.println(me);
        System.out.println(Sparky);
    }
}
