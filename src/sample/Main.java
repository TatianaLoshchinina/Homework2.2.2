package sample;

public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double bmi = bmiService.calculate(90, 190);
        System.out.println("Ваш индекс массы тела = " + bmi / 10);
    }
}