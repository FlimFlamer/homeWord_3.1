public class Automobil {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;



    public Automobil(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

        if(brand == null || model == null || country == null) {
            brand = "default";
            model = "default";
            country = "default";
        }
        if (engineVolume <= 0){
            engineVolume = 1.5;
        }
        if (color == null){
            color = "белый";
        }
        if (year <= 0) {
            year = 2000;
        }
    }
    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка " + country + ", " + color + " цвет, объём двигаеля - " + engineVolume + " л." ;
    }
}

