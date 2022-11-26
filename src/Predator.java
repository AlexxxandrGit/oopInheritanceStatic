public class Predator extends Mammal {
    private String typeOfFood;

    public Predator(String animalName, int numberOfYears, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(animalName, numberOfYears, livingEnvironment, movementSpeed);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Введите корректные данные";
        } else this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Введите корректные данные";
        } else this.typeOfFood = typeOfFood;
    }

    public Predator(String animalName, int numberOfYears, String livingEnvironment, double movementSpeed) {
        super(animalName, numberOfYears, livingEnvironment, movementSpeed);
    }

    @Override
    public void eat() {
        System.out.println("Ем как хищник");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Сплю как хищник");
        super.sleep();
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь как хищник");
        super.move();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void hunt() {
        System.out.println("Я могу охотиться");
    }


}
