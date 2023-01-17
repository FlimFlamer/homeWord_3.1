import Cars.*;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Володя", true, 3.5);
        DriverC driverC = new DriverC("Михалыч", true, 10);
        DriverD driverD = new DriverD("Степаныч", true, 25);
        Automobil ladaGranta = new Automobil("Лада", "Гранта",  1.7, driverB);
        Automobil audiA8 = new Automobil("Audi", "A8", 3.0, driverB);
        Automobil bmwZ8 = new Automobil("BMW", "Z8", 3.0, driverB);

        Bus ikarus250 = new Bus("Икарус", "250", 1996,  10.6, driverD);
        Bus liaz4292 = new Bus("ЛиАЗ", "4292", 2015,  4.4, driverD);
        Bus manLion = new Bus("MAN", "Lion", 2016,  6.8, driverD);
        Truck kamaz53504 = new Truck("Камаз", "53504",   12.0, driverC);
        Truck manF2000 = new Truck("MAN", "F2000",  12.0, driverC);
        Truck peterbilt579 = new Truck("Peterbilt", "579", 15.0, driverC);

        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());

        System.out.println(ikarus250);
        System.out.println(liaz4292);
        System.out.println(manLion);
        System.out.println(kamaz53504);
        System.out.println(manF2000);
        System.out.println(peterbilt579);

        System.out.println(Automobil.TIME_LAP);
        System.out.println(Bus.TIME_LAP);
        System.out.println(Truck.TIME_LAP);

        System.out.println(Automobil.MAX_SPEED);
        System.out.println(Bus.MAX_SPEED);
        System.out.println(Truck.MAX_SPEED);

        System.out.println(Automobil.PIT_STOP);

       printInfo(ladaGranta);
        printInfo(ikarus250);
        printInfo(kamaz53504);

    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getTransportBrand() + " " + transport.getTransportModel() + " и будет участвовать в заезде");
    }
}
