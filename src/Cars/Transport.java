package Cars;

import Cars.exeption.DiagnosticExeption;
import Drivers.Driver;
import Mechanics.Mechanic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport <D extends Driver> implements Сompeting {

    protected String transportBrand;
    protected String transportModel;
    protected double engineVolume;
    protected D driver;
    public static List<Mechanic> mechanics = new ArrayList<>();

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_VOLUME = 3.0;

    public Transport(String transportBrand, String transportModel, double engineVolume, D driver) {


        setTransportBrand(transportBrand);
        setTransportModel(transportModel);
        setEngineVolume(engineVolume);
        this.driver = driver;
    }


    public abstract void printType();
    public abstract boolean diagnostics() throws DiagnosticExeption;

    public static void addMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }
    public String getTransportBrand() {
        return transportBrand;
    }

    public void setTransportBrand(String transportBrand) {
        if (transportBrand == null || transportBrand.isBlank()) {
            this.transportBrand = DEFAULT_VALUE;
        } else {
            this.transportBrand = transportBrand;
        }
    }

    public String getTransportModel() {
        return this.transportModel;
    }

    public void setTransportModel(String transportModel) {
        if (transportModel == null || transportModel.isBlank()) {
            this.transportModel = DEFAULT_VALUE;
        } else {
            this.transportModel = transportModel;
        }
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0){
            this.engineVolume = DEFAULT_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public D getDriver() {
        return this.driver;
    }
    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(transportBrand, transport.transportBrand) && Objects.equals(transportModel, transport.transportModel) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportBrand, transportModel, engineVolume, driver);
    }
}
