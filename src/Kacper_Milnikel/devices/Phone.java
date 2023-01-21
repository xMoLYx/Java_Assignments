package Kacper_Milnikel.devices;
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


}
