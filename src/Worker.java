import java.time.LocalDate;

public class Worker extends Person implements Efficient {


    public Worker(String name, int age, int height, int countOfKids, int birthday, double minimalSalary, double maximumSalary, String gender) {
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
        return MainFindingTheAverage.averageForTwo(maximumSalary, minimalSalary);
    }

    public String toString() {
        return "Лицо, не достигшее пенсионнго возраста(рабочий){" +
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
        System.out.println("Я счастливо шагаю на работу");
    }
}



