import Cars.*;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Володя", true, 3.5);
        DriverC driverC = new DriverC("Михалыч", true, 10);
        DriverD driverD = new DriverD("Степаныч", true, 25);
        Automobil ladaGranta = new Automobil("Лада", "Гранта", 2015, "Россия", "Желтый", 185, 1.7, "Механика", "Седан", "А123БВ001", 5, true, true, true, driverB);
        Automobil audiA8 = new Automobil("Audi", "A8", 2020, "Германия", "Чёрный", 260, 3.0, "Автомат", "Седан", "Г456ДЕ002", 5, true, true, true, driverB);
        Automobil bmwZ8 = new Automobil("BMW", "Z8", 2021, "Германия", "Чёрный", 280, 3.0, "Автомат", "Купе", "Ж789ЗИ003", 2, true, true, true, driverB);
//        Automobil kiaSportage = new Automobil("Kia", "Sportage", 2018, "Южная Корея", "Красный", 190, 2.4, "Автомат", "Кроссовер", "К147ЛМ004", 5, true, true, true);
//        Automobil hyundaiAvante = new Automobil("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 180, 1.6, "Автомат", "Седан", "Н258ОП005", 5, true, true, true);
        Bus ikarus250 = new Bus("Икарус", "250", 1996, "Венгрия", "Красный", 120, 10.6, driverD);
        Bus liaz4292 = new Bus("ЛиАЗ", "4292", 2015, "Россия", "Голубой", 120, 4.4, driverD);
        Bus manLion = new Bus("MAN", "Lion", 2016, "Германия", "Серый", 90, 6.8, driverD);
        Truck kamaz53504 = new Truck("Камаз", "53504", 2016, "Россия", "Синий", 120, 12.0, driverC);
        Truck manF2000 = new Truck("MAN", "F2000", 2000, "Германия", "Синий", 120, 12.0, driverC);
        Truck peterbilt579 = new Truck("Peterbilt", "579", 2010, "США", "Красный", 160, 15.0, driverC);

        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());
//        System.out.println(kiaSportage.toString());
//        System.out.println(hyundaiAvante.toString());
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
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + Transport.getTransportBrand("") + " " + transport.getTransportModel("") + " и будет участвовать в заезде");
    }
}
