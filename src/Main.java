import Transport.Automobil;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Automobil ladaGranta = new Automobil("Лада", "Гранта", 1.7, "Желтый", 2015, "Россия", "Ручная", "Седан", "А123БВ001", 5, true, true, true);
        Automobil audiA8 = new Automobil("Audi", "A8", 3.0, "Чёрный", 2020, "Германия","Автоматическая", "Седан", "Г456ДЕ002", 5, true, true, true);
        Automobil bmwZ8 = new Automobil("BMW","Z8", 3.0,"Чёрный", 2021, "Германия", "Механическая", "Купе", "Ж789ЗИ003", 2, true, true, true);
        Automobil kiaSportage = new Automobil("Kia", "Sportage", 2.4, "Красный", 2018, "Южная Корея", "Автомат", "Кроссовер", "К147ЛМ004", 5, true, true, true);
        Automobil hyundaiAvante = new Automobil("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "Автомат", "Седан", "Н258ОП005", 5, true, true, true);

        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());
        System.out.println(kiaSportage.toString());
        System.out.println(hyundaiAvante.toString());
    }
}