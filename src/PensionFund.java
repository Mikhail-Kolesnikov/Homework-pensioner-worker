public class PensionFund {

    static final double PERCENTAGE_OF_PENSION_FROM_SALARY = 0.7;

    public double calculationOfPensionFromSalary(Person person) {
        System.out.println("Резмер пенсии от заработной платы");

        return person.averageOfSalary() * PERCENTAGE_OF_PENSION_FROM_SALARY;


    }


}






