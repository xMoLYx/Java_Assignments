package Kacper_Milnikel;

import Kacper_Milnikel.creatures.Human;
//zad8
public interface Saleable {
    void sell(Human seller, Human buyer, Double price) throws Exception;
}
