public class NonFlyingBird extends Bird {
    private String movementType;

    public NonFlyingBird(String animalName, int numberOfYears, String livingEnvironment, String movementType) {
        super(animalName, numberOfYears, livingEnvironment);
        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = "Введите корректные данные";
        } else this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = "Введите корректные данные";
        } else this.movementType = movementType;
    }

    public NonFlyingBird(String animalName, int numberOfYears, String livingEnvironment) {
        super(animalName, numberOfYears, livingEnvironment);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void move() {
        super.move();
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
        System.out.println("Я могу гулять");
    }

}
