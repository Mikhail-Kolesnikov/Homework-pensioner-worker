import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //       Pensioner pensioner = new Pensioner("Sid", 68, 176, 4, LocalDate.of(1934, 11, 23), 2000, 3500,"Мужской");
        //      Worker worker = new Worker("Трудоголик", 38, 178, 2, LocalDate.of(1984, 9, 11), 2500, 4700,"Мужской");


//        PensionFund pensionFund = new PensionFund();
//        starik.getInfo();
//        System.out.println(pensionFund.calculationOfPensionFromSalary(starik));
//        System.out.println(worker.averageOfSalary());
//
//        System.out.println(starik);
//        System.out.println(worker);
        Efficient a = new Worker("Павел", 38, 170, 4, 1987 - 12 - 23, 2000, 3000, "Мужской");
        Efficient b = new Pensioner("Павел", 68, 170, 4, 1968 - 11 - 24, 1500, 2500, "Муж");


        a.goToWork();
        b.goToWork();
        Minors minors = new Minors();
        minors.averageOfSalary();


    }


}


//1. Самостоятельно определить, в какие классы нужно добавить методы equals, hascode, toString
//2. Реализовать (переопределить) методы equals, hascode, toString для этих классов
//3. Equals, hascode разрещено сгенерировать через кнопку generate,
//3.1 Метод toString нужно создать самостоятельно
//4. Вариант реализации метода toString придумайте самостоятельно (самое главное - информативность)






























