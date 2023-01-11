import Transport.Automobil;
import Transport.Bus;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Automobil ladaGranta = new Automobil("Лада", "Гранта", 2015, "Россия", "Желтый", 185, 1.7, "Механика", "Седан", "А123БВ001", 5, true, true, true);
        Automobil audiA8 = new Automobil("Audi", "A8", 2020, "Германия", "Чёрный", 260,3.0, "Автомат", "Седан", "Г456ДЕ002", 5, true, true, true);
        Automobil bmwZ8 = new Automobil("BMW","Z8", 2021,"Германия", "Чёрный", 280, 3.0, "Автомат", "Купе", "Ж789ЗИ003", 2, true, true, true);
        Automobil kiaSportage = new Automobil("Kia", "Sportage", 2018, "Южная Корея", "Красный", 190, 2.4, "Автомат", "Кроссовер", "К147ЛМ004", 5, true, true, true);
        Automobil hyundaiAvante = new Automobil("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 180, 1.6, "Автомат", "Седан", "Н258ОП005", 5, true, true, true);
        Bus ikarus250 = new Bus("Икарус", "250", 1996, "Венгрия", "Красный", 120);
        Bus liaz4292 = new Bus ("ЛиАЗ", "4292", 2015, "Россия", "Голубой", 120);
        Bus manLion = new Bus ("MAN", "Lion", 2016, "Германия", "Серый", 90);

        System.out.println(ladaGranta.toString());
        System.out.println(audiA8.toString());
        System.out.println(bmwZ8.toString());
        System.out.println(kiaSportage.toString());
        System.out.println(hyundaiAvante.toString());
        System.out.println(ikarus250);
        System.out.println(liaz4292);
        System.out.println(manLion);
    }
}