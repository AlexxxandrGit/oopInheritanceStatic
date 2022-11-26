public class Bus extends Transport {
    public Bus(String brand, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, double maximumMovementSpeed) {
        super(brand, model, yearOfIssue, countryOfOrigin, bodyColor, maximumMovementSpeed);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином или дизелем на заправке.");
    }
}
