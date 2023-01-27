import Cars.*;
import Cars.bus.Bus;
import Cars.bus.PassengerCapacity;
import Cars.car.Automobil;
import Cars.car.BodyType;
import Cars.exeption.DiagnosticExeption;
import Cars.truck.LoadCapacity;
import Cars.truck.Truck;
import Drivers.Driver;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Mechanics.CarType;
import Mechanics.Mechanic;
import Mechanics.ServiceStation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Mechanic mechanic1 = new Mechanic("Механик Первый", "Фиксики", CarType.CAR);
        Mechanic mechanic2 = new Mechanic("Механик Второй", "Лунтики", CarType.BUS);
        Mechanic mechanic3 = new Mechanic("Механик Третий", "Синий Трактор", CarType.TRUCK);

        DriverB driverB = new DriverB("Володя", true, 3.5);
        DriverC driverC = new DriverC("Михалыч", true, 10);
        DriverD driverD = new DriverD("Степаныч", true, 25);

        Automobil ladaGranta = new Automobil("Лада", "Гранта",  1.7, driverB, BodyType.SEDAN);
        Automobil audiA8 = new Automobil("Audi", "A8", 3.0, driverB, BodyType.COUPE);
        Automobil bmwZ8 = new Automobil("BMW", "Z8", 3.0, driverB, BodyType.COUPE);

        Bus ikarus250 = new Bus("Икарус", "250", 1996,  10.6, driverD, PassengerCapacity.BIG);
        Bus liaz4292 = new Bus("ЛиАЗ", "4292", 2015,  4.4, driverD, PassengerCapacity.BIG);
        Bus manLion = new Bus("MAN", "Lion", 2016,  6.8, driverD, PassengerCapacity.BIG);
        Truck kamaz53504 = new Truck("Камаз", "53504",   12.0, driverC, LoadCapacity.N2);
        Truck manF2000 = new Truck("MAN", "F2000",  12.0, driverC, LoadCapacity.N2);
        Truck peterbilt579 = new Truck("Peterbilt", "579", 15.0, driverC, LoadCapacity.N3);

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

        try {
            System.out.println(ladaGranta.diagnostics());
        } catch (DiagnosticExeption e) {
            e.printStackTrace();
        }

        Automobil.addMechanic(mechanic1);
        Bus.addMechanic(mechanic2);
        Truck.addMechanic(mechanic3);

        List<Transport<?>> raceCars = new ArrayList<>();
        Set<Driver> drivers = new HashSet<>();

        raceCars.add(ladaGranta);
        raceCars.add(audiA8);
        raceCars.add(bmwZ8);
        raceCars.add(ikarus250);
        raceCars.add(liaz4292);
        raceCars.add(manLion);
        raceCars.add(kamaz53504);
        raceCars.add(manF2000);
        raceCars.add(peterbilt579);

        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);

        ServiceStation serviceStation = new ServiceStation();

        ServiceStation.addTransportQueue(ladaGranta);
        ServiceStation.addTransportQueue(bmwZ8);
        ServiceStation.addTransportQueue(ikarus250);
        ServiceStation.addTransportQueue(kamaz53504);
        ServiceStation.addTransportQueue(peterbilt579);

        ServiceStation.serviceTransport();
        ServiceStation.serviceTransport();
        ServiceStation.serviceTransport();

    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getTransportBrand() + " " + transport.getTransportModel() + " и будет участвовать в заезде");
    }
}
