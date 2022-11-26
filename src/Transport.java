public abstract class Transport {
    //Задание 1.

    private String brand;
    private String model;
    final private int yearOfIssue;
    final private String countryOfOrigin;
    private String bodyColor;
    private double maximumMovementSpeed;

    public Transport(String brand, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, double maximumMovementSpeed) {


        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Введите корректные данные";
        } else {

            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Введите корректные данные";
        } else {

            this.model = model;
        }

        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = "Введите корректные данные";
        } else {

            this.bodyColor = bodyColor;
        }

        if (Double.compare(maximumMovementSpeed, 0) <= 0) {
            this.maximumMovementSpeed = 0;
        } else {

            this.maximumMovementSpeed = maximumMovementSpeed;
        }


        if (yearOfIssue <= 0) {
            this.yearOfIssue = 0;
        } else {

            this.yearOfIssue = yearOfIssue;
        }


        if (countryOfOrigin == null || countryOfOrigin.isEmpty() || countryOfOrigin.isBlank()) {
            this.countryOfOrigin = "Введите корректные данные";
        } else {

            this.countryOfOrigin = countryOfOrigin;
        }


    }

    public Transport(String brand, String model, int yearOfIssue, String countryOfOrigin, double maximumMovementSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Введите корректные данные";
        } else {

            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Введите корректные данные";
        } else {

            this.model = model;
        }
        if (yearOfIssue <= 0) {
            this.yearOfIssue = 0;
        } else {

            this.yearOfIssue = yearOfIssue;
        }
        if (countryOfOrigin == null || countryOfOrigin.isEmpty() || countryOfOrigin.isBlank()) {
            this.countryOfOrigin = "Введите корректные данные";
        } else {

            this.countryOfOrigin = countryOfOrigin;
        }
        if (Double.compare(maximumMovementSpeed, 0) <= 0) {
            this.maximumMovementSpeed = 0;
        } else {

            this.maximumMovementSpeed = maximumMovementSpeed;
        }


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Введите корректные данные";
        } else {

            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Введите корректные данные";
        } else {

            this.model = model;
        }
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = "Введите корректные данные";
        } else {

            this.bodyColor = bodyColor;
        }
    }

    public double getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
        if (Double.compare(maximumMovementSpeed, 0) <= 0) {
            this.maximumMovementSpeed = 0;
        } else {

            this.maximumMovementSpeed = maximumMovementSpeed;
        }
    }

    @Override
    public String toString() {
        return "Transport: " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maximumMovementSpeed=" + maximumMovementSpeed +
                ',';
    }

    public abstract void refill();


}

