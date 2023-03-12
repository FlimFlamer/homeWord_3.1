package Mechanics;

import java.util.Objects;


public class Mechanic {

    private String name;
    private String company;
    private CarType carType;


    public Mechanic(String name, String company, CarType carType) {
        this.name = name;
        this.company = company;
        this.carType = carType;
    }

    public void maintenance(){
        System.out.println("Механик " + name + " из компании " + company + " проводит техобслуживание.");
    }

    public void fixCar () {
        System.out.println("Механик " + name + " из компании " + company + " чинит авто.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", carType=" + carType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company) && carType == mechanic.carType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, carType);
    }
}
