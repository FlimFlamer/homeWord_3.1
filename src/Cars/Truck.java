package Cars;

import Drivers.DriverC;

public class Truck extends Transport<DriverC> {
    public static final String TIME_LAP = "Лучшее время для грузовых 1:10:00";
    public static final String MAX_SPEED = "Максимальная скорость грузовых 119";
    public static final String PIT_STOP = "Грузовики ПИТ-СТОП";


    public Truck(String transportBrand, String transportModel, int yearOfIssue, String transportCountry, String transportColor, int transportMaxSpeed, double engineVolume, DriverC driver) {
        super(transportBrand, transportModel, yearOfIssue, transportCountry, transportColor, transportMaxSpeed, engineVolume, driver);
        getTransportBrand(transportBrand);
        getTransportModel(transportModel);
        getEngineVolume(engineVolume);
        }
//        @Override
//        public void startMoving() {
//
//        }
//
//        @Override
//        public void stopMoving() {
//
//        }

    @Override
    public String toString() {
        return "Truck{" +
                "transportBrand='" + transportBrand + '\'' +
                ", transportModel='" + transportModel + '\'' +
                ", engineVolume = '" + engineVolume + '\'' +
                '}';
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
}


