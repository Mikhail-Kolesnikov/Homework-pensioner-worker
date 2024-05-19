import java.time.LocalDate;

public class Minors extends Person {
    @Override
    public String toString() {
        return "Minors{" +
                "maximumSalary=" + maximumSalary +
                ", minimalSalary=" + minimalSalary +
                '}';
    }
    @Override
    double averageOfSalary() {
        return MainFindingTheAverage.averageForTwo(maximumSalary, minimalSalary);
    }
}
