public class MainFindingTheAverage extends Person {

    public static double averageForTwo(double c, double d) {

        double sumTwo = c + d;
        return sumTwo / 2;

    }

    public static double averageForThree(double a, double b, double c) {
        double sum = a + b + c;
        return sum / 3;
    }


    @Override
    double averageOfSalary() {
        return 0;
    }


}

