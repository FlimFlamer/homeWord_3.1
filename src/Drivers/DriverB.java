package Drivers;

import java.util.Set;

public class DriverB extends Driver {

    public DriverB(String name, boolean drivingLicense, double experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель" + getName() + " начал движение.");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель" + getName() + " прекратил движение.");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель" + getName() + " начал заправку.");
    }
}
