package Cars.truck;

import Cars.Transport;
import Drivers.DriverC;

public class Truck extends Transport<DriverC> {

    private LoadCapacity loadCapacity;
    public static final String TIME_LAP = "Лучшее время для грузовых 1:10:00";
    public static final String MAX_SPEED = "Максимальная скорость грузовых 119";
    public static final String PIT_STOP = "Грузовики ПИТ-СТОП";


    public Truck(String transportBrand,
                 String transportModel,
                 double engineVolume,
                 DriverC driver,
                 LoadCapacity loadCapacity) {
        super(transportBrand, transportModel, engineVolume, driver);
        setTransportBrand(transportBrand);
        setTransportModel(transportModel);
        setEngineVolume(engineVolume);
        this.loadCapacity = loadCapacity;
        }

    @Override
    public String toString() {
        return "Truck{" +
                "transportBrand='" + transportBrand + '\'' +
                ", transportModel='" + transportModel + '\'' +
                ", engineVolume = '" + engineVolume + '\'' +
                '}';
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void printType() {
        if (loadCapacity != null){
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}


