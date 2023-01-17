package Cars;
import Drivers.DriverB;

public class Automobil extends Transport<DriverB> {
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

    public Automobil(String transportBrand, String transportModel, double engineVolume, DriverB driver) {
        super(transportBrand, transportModel,engineVolume, driver);


//        }
        setTransportBrand(transportBrand);
        setTransportModel(transportModel);
        setEngineVolume(engineVolume);

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



