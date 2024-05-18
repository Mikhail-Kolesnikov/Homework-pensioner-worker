import java.time.LocalDate;

public class Pensioner extends Person {
    static final double PENSION_FOR_ALL_PENSIONERS = 2000;

    public Pensioner(String name, int age, int height, int countOfKids, LocalDate birthday, double minimalSalary, double maximumSalary, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.countOfKids = countOfKids;
        this.birthday = birthday;
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
                ", Национальность=" + gender +
                '}';
    }
}





