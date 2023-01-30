package Kacper_Milnikel.devices;

import java.util.Comparator;

//zad11
public class CarsInOrder implements Comparator<Car> {

    public int compare(Car car1, Car car2) {
        if (car1 == null && car2 == null) {
            return 0;
        } else if (car1 == null) {
            return -1;
        } else if (car2 == null) {
            return 1;
        } else {
            return car1.Value.compareTo(car2.Value);
        }
    }
}
