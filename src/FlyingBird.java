public class FlyingBird extends Bird {
    private String movementType;

    public FlyingBird(String animalName, int numberOfYears, String livingEnvironment, String movementType) {
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

    public FlyingBird(String animalName, int numberOfYears, String livingEnvironment) {
        super(animalName, numberOfYears, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Кушаю, как птица умеющая летать");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Спллю, как птица умеющая летать");
        super.sleep();
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь, как птица умеющая летать");
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

    public void fly() {
        System.out.println("Я могу летать");
    }
}
