package Kacper_Milnikel.devices;
//zad7
public abstract class Device {
    public final String Model;
    public final String Producer;
    public final int yearOfProduction;

    public Device(String model, String producer, int yearOfProduction) {
        Model = model;
        Producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "Model='" + Model + '\'' +
                ", Producer='" + Producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void TurnOn();
}
