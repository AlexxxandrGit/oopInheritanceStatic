import java.util.Objects;

public abstract class Animal {
    private String animalName;
    final private int numberOfYears;

    public Animal(String animalName, int numberOfYears) {
        if (animalName == null || animalName.isEmpty() || animalName.isBlank()) {
            this.animalName = "Введите корректные данные";
        } else this.animalName = animalName;


        if (numberOfYears <= 0) {
            this.numberOfYears = 0;
        } else {

            this.numberOfYears = numberOfYears;
        }


    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        if (animalName == null || animalName.isEmpty() || animalName.isBlank()) {
            this.animalName = "Введите корректные данные";
        } else this.animalName = animalName;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    //Создал абстрактные методы, по логике всем животным это присуще, на будущее при расширении приложения это будет удобно.

    public abstract void eat();


    public abstract void sleep();


    public abstract void move();


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
}