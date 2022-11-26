public class Train extends Transport {
    private double tripPrice;
    private String travelTime;
    private String departureStationName;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int yearOfIssue, String countryOfOrigin, double maximumMovementSpeed,
                 double tripPrice, String departureStationName, String endingStation, int numberOfWagons) {
        super(brand, model, yearOfIssue, countryOfOrigin, maximumMovementSpeed);


        if (Double.compare(tripPrice, 0) <= 0) {
            this.tripPrice = 0;
        } else this.tripPrice = tripPrice;


        if (departureStationName == null || departureStationName.isEmpty() || departureStationName.isBlank()) {
            this.departureStationName = "Введите корректные данные";
        } else this.departureStationName = departureStationName;


        if (endingStation == null || endingStation.isEmpty() || endingStation.isBlank()) {
            this.endingStation = "Введите корректные данные";
        } else this.endingStation = endingStation;


        if (numberOfWagons <= 0) {
            this.numberOfWagons = 0;
        } else this.numberOfWagons = numberOfWagons;

    }


    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (Double.compare(tripPrice, 0) <= 0) {
            this.tripPrice = 0;
        } else this.tripPrice = tripPrice;

    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime == null || travelTime.isEmpty() || travelTime.isBlank()) {
            this.travelTime = "Введите корректные данные";
        } else this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName == null || departureStationName.isEmpty() || departureStationName.isBlank()) {
            this.departureStationName = "Введите корректные данные";
        } else this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        if (endingStation == null || endingStation.isEmpty() || endingStation.isBlank()) {
            this.endingStation = "Введите корректные данные";
        } else this.endingStation = endingStation;

    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 0;
        } else this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return
                "Цена поездки: " + tripPrice + ". " +
                        "Название станции отбытия: " + departureStationName + ". " +
                        "Конечная остановка: " + endingStation + ". " +
                        "Количество вагонов: " + numberOfWagons;
    }

    @Override
    public void refill() {
        System.out.println("нужно заправлять дизелем");
    }
}
