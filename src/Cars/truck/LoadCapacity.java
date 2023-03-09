package Cars.truck;

public enum LoadCapacity {
    N1(0.0f, 3.5f),
    N2(3.51f, 12.0f),
    N3(12.1f, null);
    private final Float downCapacity;
    private final Float uploadCapacity;

    LoadCapacity(Float downCapacity, Float uploadCapacity) {
        this.downCapacity = downCapacity;
        this.uploadCapacity = uploadCapacity;
    }

    public float getDownCapacity() {
        return downCapacity;
    }

    public float getUploadCapacity() {
        return uploadCapacity;
    }

    @Override
    public String toString() {
        if (uploadCapacity != null){
        return "Грузоподъемность: от " + downCapacity + " тонн, до " + uploadCapacity + " тонн.";
        } else {
            return "Грузоподъемность: от " + downCapacity + " тонн.";
        }
    }
}
