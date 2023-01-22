package Cars.car;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    PICKUP("Пикап"),
    CROSSOVER("Кроссовер"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String name;

    BodyType(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Тик кузова: " + name;
    }
}
