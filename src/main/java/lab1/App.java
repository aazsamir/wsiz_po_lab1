package lab1;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /* Lab One */
        LabOne.printNameAndAge();
        LabOne.getTwoNumbersAndPrintCalculations();
        System.out.println(LabOne.isEven(1));
        System.out.println(LabOne.isDivisibleBy3And5(15));
        System.out.println(LabOne.toPower3(3));
        System.out.println(LabOne.getTwoNumbersAndCheckTriangability());
        /* Lab Two */
        LabTwo.solveQuadraticEquation(1, 2, 1);
        System.out.println(LabTwo.ax(3));
        System.out.println(LabTwo.bx(3));
        System.out.println(LabTwo.cx(3));
        int[] arr = { 3, 2, 1, 4, 5, 6 };
        arr = LabTwo.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        WeatherInfo weatherInfo = new WeatherInfo();
        weatherInfo.setBus(true);
        weatherInfo.setRaining(false);
        System.out.println(weatherInfo.getWeatherInfo());

        DiscountInfo discountInfo = new DiscountInfo();
        discountInfo.setDiscount(true);
        discountInfo.setPremium(true);
        System.out.println(discountInfo.getDiscountInfo());

        Calc calc = new Calc();
        calc.setOperation('/');
        System.out.println(calc.calculate(1, 2));
        /* Lab Three */
        LabGroup labGroup = new LabGroup();
        labGroup.setCount(18);
        labGroup.setGrades(labGroup.getRandomGrades());
        System.out.println(labGroup.getAverage());

        SumNumberSigns sumNumberSigns = new SumNumberSigns();
        sumNumberSigns.setNumbers(sumNumberSigns.getRandomNumbers());
        sumNumberSigns.printNumberSignsCount();
        System.out.println(sumNumberSigns.sumPositives());

        Palindrom palindrom = new Palindrom();
        palindrom.setWord("kamilślimak");
        System.out.println(palindrom.isPalindrom());
        palindrom.setWord("palindrom");
        System.out.println(palindrom.isPalindrom());
    }
}
