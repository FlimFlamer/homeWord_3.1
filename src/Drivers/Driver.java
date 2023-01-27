package Drivers;

import Cars.Transport;

import java.util.Set;


public abstract class Driver {

    private String name;
    private boolean drivingLicense;
    private double experience;

    public Driver(String name, boolean drivingLicense, double experience) {
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public abstract void startMoving();

    public abstract void stopMoving();


    public abstract void refuel();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
