package Transport;

public class Automobil extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsCount;
    private boolean tyres;
    private Key key;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final int DEFAULT_SEATS = 4;

    @Override
    public String toString() {
        return "Automobil{" +
                "Brand = " + getTransportBrand(transportBrand) + '\'' +
                ", Model = " + getTransportModel(transportModel) + '\'' +
                ", Year = " + getYearOfIssue() + '\'' +
                ", Country = " + getTransportCountry() + '\'' +
                ", Max speed = " + getTransportMaxSpeed(transportMaxSpeed) + '\'' +
                ", engineVolume = " + engineVolume + '\'' +
                ", transmission = " + transmission + '\'' +
                ", bodyType = " + bodyType + '\'' +
                ", registrationNumber = " + registrationNumber + '\'' +
                ", seatsCount = " + seatsCount +
                ", tyres = " + tyres +
                ", key = " + key +
                '}';
    }

    public Automobil(String transportBrand, String transportModel, int yearOfIssue, String transportCounrty, String transportColor, int transportMaxSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber, int seatsCount, boolean tyres, boolean remoteStartEngine, boolean keylessEntry) {
        super(transportBrand, transportModel, yearOfIssue, transportCounrty, transportColor, transportMaxSpeed);

        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }

        if (seatsCount <= 0) {
            this.seatsCount = DEFAULT_SEATS;
        } else {
            this.seatsCount = seatsCount;
        }
        setTransportBrand(transportBrand);
        setTransportModel(transportModel);
        getYearOfIssue();
        setTransportMaxSpeed(transportMaxSpeed);
        getTransportCountry();
        setRegistrationNumber(registrationNumber);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setTyres(tyres);
        setKey(remoteStartEngine, keylessEntry);
    }


    class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessEntry;

        public Key(boolean remoteStartEngine, boolean keylessEntry) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return "key{" +
                    "remoteStartEngine=" + remoteStartEngine +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0){
            engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            transmission = DEFAULT_VALUE;
        }
        this.transmission = transmission;
    }

    public String getBodyType() {

        return bodyType;
    }

    public String getRegistrationNumber(String registrationNumber) {

        return this.registrationNumber;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean isTyres() {
        return tyres;
    }

    public void setTyres(boolean tyres) {

        this.tyres = tyres;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            registrationNumber = DEFAULT_VALUE;
        }
        this.registrationNumber = registrationNumber;
    }

    public void changeTyres(int mount) {
        if (mount >= 4 && mount <= 10) {
            setTyres(true);
        } else {
            setTyres(false);
        }
    }

    public void setKey(boolean remoteStartEngine, boolean keylessEntry) {
        this.key = new Key(remoteStartEngine, keylessEntry);
    }
}



