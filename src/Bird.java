public class Bird extends Animal {
    private String livingEnvironment;

    public Bird(String animalName, int numberOfYears, String livingEnvironment) {
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
        } else this.livingEnvironment = livingEnvironment;
    }

    public Bird(String animalName, int numberOfYears) {
        super(animalName, numberOfYears);
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
