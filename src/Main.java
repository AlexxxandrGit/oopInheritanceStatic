public class Main {

    public static void main(String[] args) {

        // Задание 1.1 (Для наглядности создал два объекта Car)
        System.out.println("Задание 1.1");

        Car lada = new Car("Лада", "Гранда", 2000, "Россия", "красный", 2.0, -10);
        Car bmw = new Car("BMW", "Х5", 2022, "Германия", "Черный", 200, 3.0);


        System.out.println(lada + " Объем двигателя " + lada.getEngineVolume());
        System.out.println(bmw + " Объем двигателя " + bmw.getEngineVolume());

        System.out.println();

        //Задание 1.2
        System.out.println("Задание 1.2");

        //Создаем объекты класса Train

        Train lastochka = new Train("Ласточка", " B-901", 2011, "Россия", 301,
                3500, "Белорусский вокзал ", " Минск пассажирский", 11);

        System.out.println("Поезд: " + lastochka.getBrand() + ". " + "Модель: " + lastochka.getModel() + ". Год выпуска: " + lastochka.getYearOfIssue() +
                ". Скорость передвижения: " + " " + lastochka.getMaximumMovementSpeed() + ". " + lastochka);


        Train leningrad = new Train("Ленинград", " D-125", 2019, "Россия", 270,
                1700, "Ленинградский вокзал", " Ленинград-Пассажирский", 8);
        System.out.println("Поезд: " + leningrad.getBrand() + ". " + "Модель: " + leningrad.getModel() + ". Год выпуска: " + leningrad.getYearOfIssue() +
                ". Скорость передвижения: " + " " + leningrad.getMaximumMovementSpeed() + ". " + leningrad);

        System.out.println();

        // Задание 1.3
        System.out.println("Заданик 1.3");

        Bus bus1 = new Bus("Икарус", "И123", 2000, "Россия", "Синий", 100);
        System.out.println(bus1);

        Bus bus2 = new Bus("Икарус2", "Б258", 1990, "Россия", "Черный", 150);
        System.out.println(bus2);

        Bus bus3 = new Bus("Мерседес2", "Б111", 2020, "Герания", "Белый", 190);
        System.out.println(bus2);

        System.out.println();

        // Задание 2
        System.out.println("Заданик 2");

        bmw.refill();
        lastochka.refill();
        bus1.refill();
        lada.refill();


        // Задание 3
        System.out.println("Заданик 3");
        //Травоядные
        System.out.println("Травоядные");
        Herbivore gazelle = new Herbivore("Газель - Арчи", 3, "Обитает на суше", 30, "Травоядное");
        Herbivore giraffe = new Herbivore("Жираф - Аккело", 5, "Обитает на суше", 10, "Травоядное");
        Herbivore horse = new Herbivore("Лошадь - Атос", 4, "Обитает на суше", 50, "Травоядное");

        printInfo(gazelle);
        printInfo(giraffe);
        printInfo(horse);
        horse.move();


        //Хищники
        System.out.println();
        System.out.println("Хищники");

        Predator hyena = new Predator("Гиена - Альфа", 2, "Обитает на суше", 15, "Хищник");
        Predator tiger = new Predator("Тигр - Дакс", 9, "Обитает на суше", 50, "Хищник");
        Predator bear = new Predator("Медведь - Гризли", 20, "Обитает на суше", 30, "Хищник");

        printInfo(hyena);
        printInfo(tiger);
        printInfo(bear);
        hyena.eat();

        //Земноводные
        System.out.println();
        System.out.println("Земноводные");

        Amphibian frog = new Amphibian("Лягушка - Квакуша", 5, "Вода и суша");
        Amphibian alreadyFreshwater = new Amphibian("Пресноводный уж - Ужан", 6, "Вода и суша");

        printInfo(frog);
        printInfo(alreadyFreshwater);


        System.out.println();
        //Летающие птицы
        System.out.println("Летающие птицы");

        FlyingBird gull = new FlyingBird(" Чайка - Дакс", 3, "Воздух", "Умеет летать");
        FlyingBird albatross = new FlyingBird(" Альбатрос - Кеша", 1, "Воздух", "Умеет летать");
        FlyingBird falcon = new FlyingBird(" Сокол - Зоил", 7, "Воздух", "Умеет летать");

        printInfo(gull);
        printInfo(albatross);
        printInfo(falcon);

        System.out.println();
        //Нелетающие птицы
        System.out.println("Нелетающие птицы");

        NonFlyingBird peacock = new NonFlyingBird("Павлин - Коломбо", 5, "Земля", "Не умеет летать");
        NonFlyingBird penguin = new NonFlyingBird("Пингвин - Моки", 6, "Земля", "Не умеет летать");
        NonFlyingBird dodoBird = new NonFlyingBird("Птица додо - Коломбо", 4, "Земля", "Не умеет летать");

        printInfo(peacock);
        printInfo(penguin);
        printInfo(dodoBird);

        System.out.println();

        //Сравнение двух объектов
        System.out.println("Сравнение двух объектов");
        System.out.println(frog.equals(alreadyFreshwater));
        System.out.println(tiger.equals(tiger));


    }

    public static void printInfo(Herbivore herbivore) {

        System.out.println("Животное и имя: " + herbivore.getAnimalName() +
                " / Количество лет: " + herbivore.getNumberOfYears() +
                " / Среда обитания: " + herbivore.getLivingEnvironment() +
                " / Скорость перемещения: " + herbivore.getMovementSpeed() +
                " / Тип питания: " + herbivore.getTypeOfFood());
    }

    public static void printInfo(Predator predator) {

        System.out.println("Животное и имя: " + predator.getAnimalName() +
                " / Количество лет: " + predator.getNumberOfYears() +
                " / Среда обитания: " + predator.getLivingEnvironment() +
                " / Скорость перемещения: " + predator.getMovementSpeed() +
                " / Тип питания: " + predator.getTypeOfFood());
    }

    public static void printInfo(Amphibian amphibian) {

        System.out.println("Животное и имя: " + amphibian.getAnimalName() +
                " / Количество лет: " + amphibian.getNumberOfYears() +
                " / Среда обитания: " + amphibian.getLivingEnvironment());

    }


    public static void printInfo(FlyingBird flyingBird) {

        System.out.println("Животное и имя: " + flyingBird.getAnimalName() +
                " / Количество лет: " + flyingBird.getNumberOfYears() +
                " / Среда обитания: " + flyingBird.getLivingEnvironment() +
                " / Тип передвижения: " + flyingBird.getMovementType());
    }

    public static void printInfo(NonFlyingBird nonFlyingBird) {

        System.out.println("Животное и имя: " + nonFlyingBird.getAnimalName() +
                " / Количество лет: " + nonFlyingBird.getNumberOfYears() +
                " / Среда обитания: " + nonFlyingBird.getLivingEnvironment() +
                " / Тип передвижения: " + nonFlyingBird.getMovementType());
    }


}
