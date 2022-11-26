import java.util.Objects;

public class Herbivore extends Mammal {
    private String typeOfFood;

    public Herbivore(String animalName, int numberOfYears, String livingEnvironment, double movementSpeed, String typeOfFood) {
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


    public Herbivore(String animalName, int numberOfYears, String livingEnvironment, double movementSpeed) {
        super(animalName, numberOfYears, livingEnvironment, movementSpeed);
    }

    @Override
    public String getLivingEnvironment() {
        return super.getLivingEnvironment();
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

    @Override
    public void setLivingEnvironment(String livingEnvironment) {
        super.setLivingEnvironment(livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Ем как травоядное");
        super.eat();
    }

    @Override
    public void sleep() {
        System.out.println("Сплю как травоядное");
        super.sleep();
    }

    @Override
    public void move() {
        System.out.println("Передвигаюсь как травоядное");
        super.move();
    }

    public void graze() {
        System.out.println("Может пастись");
    }
}
