package Transport;

public class Automobil {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;

    private String registrationNumber;
    private final int seatsCount;
    private boolean tyres;
    private Key key;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2000;

    private static final int DEFAULT_SEATS = 4;

    @Override
    public String toString() {
        return "Automobil{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seatsCount=" + seatsCount +
                ", tyres=" + tyres +
                ", key=" + key +
                '}';
    }

    public Automobil(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int seatsCount, boolean tyres, boolean remoteStartEngine, boolean keylessEntry) {

        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }

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

        getRegistrationNumber(registrationNumber);
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setTyres(tyres);
        setKey(remoteStartEngine ,keylessEntry);
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
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            color = DEFAULT_COLOR;
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || color.isBlank()) {
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
        this.key = new Key(remoteStartEngine,keylessEntry);
    }
}



