package Drivers;


import java.util.Objects;

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

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingLicense == driver.drivingLicense && Double.compare(driver.experience, experience) == 0 && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, drivingLicense, experience);
    }
}
