package Cars.bus;

public enum PassengerCapacity {
    ESPECIALLI_SMALL(0,10),
    SMALL(11, 25),
    MEDIUM(40,50),
    BIG(60,80),
    VERY_BIG(100, 120);

    private final Integer downCapacity;
    private final Integer uploadCapacity;

    PassengerCapacity(Integer downCapacity, Integer uploadCapacity) {
        this.downCapacity = downCapacity;
        this.uploadCapacity = uploadCapacity;
    }

    public Integer getDownCapacity() {
        return downCapacity;
    }

    public Integer getUploadCapacity() {
        return uploadCapacity;
    }

    @Override
    public String toString() {
        return "Вместимость: от " + downCapacity + " до " + uploadCapacity + " мест.";
    }
}
