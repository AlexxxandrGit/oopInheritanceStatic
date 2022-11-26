public class Mammal extends Animal {
    private String livingEnvironment;
    private double movementSpeed;

    public Mammal(String animalName, int numberOfYears, String livingEnvironment, double movementSpeed) {
        super(animalName, numberOfYears);

        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Введите корректные данные";
        } else {

            this.livingEnvironment = livingEnvironment;
        }


        if (Double.compare(movementSpeed, 0) <= 0) {
            this.movementSpeed = 0;
        } else {

            this.movementSpeed = movementSpeed;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Введите корректные данные";
        } else {

            this.livingEnvironment = livingEnvironment;
        }
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        if (Double.compare(movementSpeed, 0) <= 0) {
            this.movementSpeed = 0;
        } else {

            this.movementSpeed = movementSpeed;
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }


    public Mammal(String animalName, int numberOfYears) {
        super(animalName, numberOfYears);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void walk() {
        System.out.println("Может гулять");
    }
}
