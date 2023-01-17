package Cars;

import Drivers.DriverD;

public class Bus extends Transport<DriverD> {
    public static final String TIME_LAP = "Лучшее время для автобусов 1:21:00";
    public static final String MAX_SPEED = "Максимальная скорость автобусов 90";
    public static final String PIT_STOP = "Автобусы ПИТ-СТОП";

    public Bus(String transportBrand, String transportModel, int yearOfIssue, String transportCountry, String transportColor, int transportMaxSpeed, double engineVolume, DriverD driver) {
        super(transportBrand, transportModel, yearOfIssue, transportCountry, transportColor, transportMaxSpeed, engineVolume, driver);
        getTransportBrand(transportBrand);
        getTransportModel(transportModel);
        getEngineVolume(engineVolume);
//        getYearOfIssue();
//        getTransportCountry();
//        setTransportColor(transportColor);
//        setTransportMaxSpeed(transportMaxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "transportBrand ='" + transportBrand + '\'' +
                ", transportModel ='" + transportModel + '\'' +
                ", engineVolume ='" + engineVolume + '\'' +
//                ", yearOfIssue=" + yearOfIssue +
//                ", transportCountry='" + transportCountry + '\'' +
//                ", transportColor='" + transportColor + '\'' +
//                ", transportMaxSpeed=" + transportMaxSpeed +
                '}';
    }
//    @Override
//    public void startMoving() {
//
//    }
//
//    @Override
//    public void stopMoving() {
//
//    }

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
}
