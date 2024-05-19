import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Objects;


public abstract class Person {

    protected String name;
    protected int age;
    protected int height;
    protected int countOfKids;
    protected LocalDate birthday;
    protected double minimalSalary;
    protected double maximumSalary;
//    protected LocalDate birthdate;
    protected String gender;
    static final int YEAR_OF_START_OF_WORK = 18;


    public void getInfo() {
        System.out.println("///////////////////////////////////////////");
        System.out.println("Имя : " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Количество детей " + countOfKids + " Детей");
        System.out.println("День рождегия " + birthday);
        System.out.println("Пол" + gender);

        System.out.println();

    }

    public int workExperience() {

        int result = age - YEAR_OF_START_OF_WORK;

        return result;


    }

    public Person(String name, int age, int height, int countOfKids, LocalDate birthday) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.countOfKids = countOfKids;
        this.birthday = birthday;
    }

    public Person() {
    }


    public void greetings() {

        System.out.println("Рад приветствовать Вас!");
        System.out.println("////////////////////////////////////////////////////");
    }

    public double averageSalary() {
        return MainFindingTheAverage.averageForTwo(minimalSalary, maximumSalary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCountOfKids() {
        return countOfKids;
    }

    public void setCountOfKids(int countOfKids) {
        this.countOfKids = countOfKids;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getMinimalSalary() {
        return minimalSalary;
    }

    public void setMinimalSalary(double minimalSalary) {
        this.minimalSalary = minimalSalary;
    }

    public double getMaximumSalary() {
        return maximumSalary;
    }

    public void setMaximumSalary(double maximumSalary) {
        this.maximumSalary = maximumSalary;

    }

    abstract double averageOfSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (countOfKids != person.countOfKids) return false;
        if (Double.compare(person.minimalSalary, minimalSalary) != 0) return false;
        if (Double.compare(person.maximumSalary, maximumSalary) != 0) return false;
        if (!Objects.equals(name, person.name)) return false;
        if (!Objects.equals(birthday, person.birthday)) return false;
        return Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + countOfKids;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        temp = Double.doubleToLongBits(minimalSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maximumSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", countOfKids=" + countOfKids +
                ", birthday=" + birthday +
                ", minimalSalary=" + minimalSalary +
                ", maximumSalary=" + maximumSalary +
                '}';
    }


}













