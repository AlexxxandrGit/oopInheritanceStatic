public class Car extends Transport {
    private double engineVolume;

    public Car(String brand, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, double maximumMovementSpeed, double engineVolume) {
        super(brand, model, yearOfIssue, countryOfOrigin, bodyColor, maximumMovementSpeed);
        if (Double.compare(engineVolume, 0) <= 0) {
            this.engineVolume = 0;
        } else {

            this.engineVolume = engineVolume;
        }


    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }

    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }
}
