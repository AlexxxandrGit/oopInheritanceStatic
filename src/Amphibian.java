import java.util.Objects;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String animalName, int numberOfYears, String livingEnvironment) {
        super(animalName, numberOfYears);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Введите корректные данные";
        } else this.livingEnvironment = livingEnvironment;
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


    @Override
    public void eat() {
        System.out.println("Питаюсь как земноводное");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю как земноводное");
    }

    @Override
    public void move() {
        System.out.println("Перемещаюсь как земноводное");
    }


    public Amphibian(String animalName, int numberOfYears) {
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

    public void hunt() {
        System.out.println("Я могу охотиться");
    }
}
