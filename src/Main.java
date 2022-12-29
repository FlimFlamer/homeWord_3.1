public class Main {
    public static void main(String[] args) {
        Automobil ladaGranta = new Automobil("Лада", "Гранта", 1.7, "Желтый", 2015, "Россия");
        Automobil audiA8 = new Automobil("Audi", "A8", 3.0, "Черный", 2020, "Германия");
        Automobil bmwZ8 = new Automobil("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Automobil kiaSportage = new Automobil("KIA", "Sportage 4gen", 2.4, "Красный", 2018, "Южная Корея");
        Automobil hyundaiAvante = new Automobil("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}