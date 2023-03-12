package Cars.car;
import Cars.Transport;
import Cars.exeption.DiagnosticExeption;
import Drivers.DriverB;
import Mechanics.Mechanic;

import java.util.Objects;

public class Automobil extends Transport<DriverB> {

    private BodyType bodyType;
    public static final String TIME_LAP = "Лучшее время для легковых 0:58:00";
    public static final String MAX_SPEED = "Максимальная скорость легковых 260";
    public static final String PIT_STOP = "Легковые ПИТ-СТОП";


    @Override
    public String toString() {
        return "Automobil{" +
                "Brand = " + transportBrand + '\'' +
                ", Model = " + transportModel + '\'' +
                ", engineVolume = " + engineVolume + '\'' +
                '}';
    }

    public Automobil(String transportBrand,
                     String transportModel,
                     double engineVolume,
                     DriverB driver,
                     BodyType bodyType) {
        super(transportBrand, transportModel,engineVolume, driver);


//        }
        setTransportBrand(transportBrand);
        setTransportModel(transportModel);
        setEngineVolume(engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType != null){
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }

    }

    @Override
    public boolean diagnostics() throws DiagnosticExeption {
        if (getDriver() != null && getDriver().getDrivingLicense()){
            return true;
        } else {
            throw new DiagnosticExeption();
        }
    }

    public boolean diagnostics(boolean diagnostics) throws DiagnosticExeption {
        if (getDriver() != null && getDriver().getDrivingLicense()){
            return true;
        } else {
            throw new DiagnosticExeption();
        }
    }

    @Override
    public String pitStop() {
        return PIT_STOP;
    }

    @Override
    public String getTimeBestLap() {
        return TIME_LAP;
    }

    @Override
    public String getMaxSpeed() {
        return MAX_SPEED;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Automobil automobil = (Automobil) o;
        return bodyType == automobil.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }
}



