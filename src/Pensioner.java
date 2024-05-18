import java.time.LocalDate;
import java.util.Random;

public class Pensioner extends Person implements Efficient {
    static final double PENSION_FOR_ALL_PENSIONERS = 2000;

    public Pensioner(String name, int age, int height, int countOfKids, int birthday, double minimalSalary, double maximumSalary, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.countOfKids = countOfKids;
        this.birthday = LocalDate.ofEpochDay(birthday);
        this.minimalSalary = minimalSalary;
        this.maximumSalary = maximumSalary;
        this.gender = gender;
    }



    @Override
    public double averageOfSalary() {
        return MainFindingTheAverage.averageForThree(maximumSalary, minimalSalary, Pensioner.PENSION_FOR_ALL_PENSIONERS);
    }


    public String toString() {
        return "Лицо, достигшее пенсионного возраста{" +
                "Имя='" + name + '\'' +
                ", Возраст=" + age +
                ", Рост=" + height +
                ", Количество детей=" + countOfKids +
                ", Дата рождения=" + birthday +
                ", Минимальная зароботная плата=" + minimalSalary +
                ", Максимальная зароботная плата=" + maximumSalary +
                ", Пол=" + gender +
                '}';
    }

    @Override
    public void goToWork() {
        Random random = new Random();

        int count = random.nextInt(0, 3);
        if (count == 1) {
            System.out.println("Я вообще-то на пенсии");
        }
        if (count == 2) {
            System.out.println("Ладно, немного поработаю");
        }

    }
}
//1.1 Создаете класс "Подросток" (наследуется от Person)
//        1.2 Реализуйте в нем метод, который считает среднюю зарплату так, чтобы он всегда возвращал 0 (независимо не от чего, у детей нет зарплаты)
//        1.3) (необязательный) добавить различные поля в класс Подросток
//
//2.1 Создайте интерфейс "Доступный к работе" с одним методом внутри, который ничего не принимает и ничего не отдает. Название метода = "Идти на работу"
//2.2 Реализуйте данный интерфейс у работника и у пенсионера
//2.3 В реализации метода в работнике напишите на экран "Я счастливо шагаю на работу"
//        2.3 В Пенсионере, при реализации метода, сделайте случайный выбор (Random) между надписями на экран: "Я вообще-то на пенсии" и "Ладно, немного поработаю"




