import java.time.LocalDate;

public class Worker extends Person {


    public Worker(String name, int age, int height, int countOfKids, LocalDate birthday, double minimalSalary, double maximumSalary) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.countOfKids = countOfKids;
        this.birthday = birthday;
        this.minimalSalary = minimalSalary;
        this.maximumSalary = maximumSalary;

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
                '}';


    }
    }



