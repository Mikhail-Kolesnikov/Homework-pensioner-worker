import java.time.LocalDate;

public class Minors extends Person{
    @Override
    public String toString() {
        return "Minors{" +
                "maximumSalary=" + maximumSalary +
                ", minimalSalary=" + minimalSalary +
                '}';
    }

    public Minors() {
    }

    @Override
    double averageOfSalary() {
        return 0;
    }
}
