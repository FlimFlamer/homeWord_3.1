package Transport;

public class Bus extends Transport{
    public Bus(String transportBrand, String transportModel, int yearOfIssue, String transportCountry, String transportColor, int transportMaxSpeed) {
        super(transportBrand, transportModel, yearOfIssue, transportCountry, transportColor, transportMaxSpeed);
        setTransportBrand(transportBrand);
        setTransportModel(transportModel);
        getYearOfIssue();
        getTransportCountry();
        setTransportColor(transportColor);
        setTransportMaxSpeed(transportMaxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "transportBrand='" + transportBrand + '\'' +
                ", transportModel='" + transportModel + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", transportCountry='" + transportCountry + '\'' +
                ", transportColor='" + transportColor + '\'' +
                ", transportMaxSpeed=" + transportMaxSpeed +
                '}';
    }
}
