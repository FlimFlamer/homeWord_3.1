package Cars;

import Drivers.Driver;

public abstract class Transport <D extends Driver> implements Сompeting {

    protected static String transportBrand;
    protected String transportModel;
    protected double engineVolume;
    protected D driver;
//    protected final int yearOfIssue;
//    protected final String transportCountry;
//    protected String transportColor;
//    protected int transportMaxSpeed;

    private static final String DEFAULT_VALUE = "default";
//    private static final String DEFAULT_COLOR = "белый";
//    private static final int DEFAULT_SPEED = 0;
//    private static final int DEFAULT_YEAR = 2000;
    private static final double DEFAULT_VOLUME = 3.0;

    public Transport(String transportBrand, String transportModel, int yearOfIssue, String transportCountry, String transportColor, int transportMaxSpeed, double engineVolume, D driver) {

//        if (yearOfIssue <= 0){
//            this.yearOfIssue = DEFAULT_YEAR;
//        } else {
//            this.yearOfIssue = yearOfIssue;
//        }
//        if (transportCountry == null || transportCountry.isBlank()){
//            this.transportCountry = DEFAULT_VALUE;
//        } else {
//            this.transportCountry = transportCountry;
//        }

        this.transportBrand = transportBrand;
        this.transportModel = transportModel;
        getEngineVolume(engineVolume);
        this.driver = driver;
//        getTransportColor(transportColor);
//        getTransportMaxSpeed(transportMaxSpeed);
    }

    public static String getTransportBrand(String transportBrand) {
        return Transport.transportBrand;
    }

    public void setTransportBrand(String transportBrand) {
        if (transportBrand == null || transportBrand.isBlank()) {
            this.transportBrand = DEFAULT_VALUE;
        } else {
            this.transportBrand = transportBrand;
        }
    }

    public String getTransportModel(String transportModel) {
        return this.transportModel;
    }

    public void setTransportModel(String transportModel) {
        if (transportModel == null || transportModel.isBlank()) {
            this.transportModel = DEFAULT_VALUE;
        } else {
            this.transportModel = transportModel;
        }
    }
    public double getEngineVolume(double engineVolume) {
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


    //    public int getYearOfIssue() {
//        return yearOfIssue;
//    }
//
//    public String getTransportCountry() {
//        return transportCountry;
//    }
//
//    public String getTransportColor(String transportColor) {
//        return transportColor;
//    }
//
//    public void setTransportColor(String transportColor) {
//        if (transportColor == null || transportColor.isBlank()) {
//            transportColor = DEFAULT_COLOR;
//        } else {
//            this.transportColor = transportColor;
//        }
//    }
//
//    public int getTransportMaxSpeed(int transportMaxSpeed) {
//        return transportMaxSpeed;
//    }
//
//    public void setTransportMaxSpeed(int transportMaxSpeed) {
//        if (transportMaxSpeed <= 0){
//            transportMaxSpeed = DEFAULT_SPEED;
//        } else {
//            this.transportMaxSpeed = transportMaxSpeed;
//        }
//    }
//    public abstract void startMoving();
//    public abstract void stopMoving();
}
