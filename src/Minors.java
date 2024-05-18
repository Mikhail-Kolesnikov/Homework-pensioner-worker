import java.time.LocalDate;

public class Minors extends Person {
//    @Override
//    public String toString() {
//        return "Minors{" +
//                "maximumSalary=" + maximumSalary +
//                ", minimalSalary=" + minimalSalary +
//                '}';
//    }

   public Minors(int minimalSalary, int maximumSalary) {
       this.maximumSalary = maximumSalary;
       this.minimalSalary = minimalSalary;
    }

    @Override
    double averageOfSalary() {
        return MainFindingTheAverage.averageForTwo(maximumSalary,minimalSalary);
    }
}
