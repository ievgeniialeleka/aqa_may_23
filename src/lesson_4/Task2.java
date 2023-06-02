package lesson_4;

public class Task2 {
    static int rateEuroToHryvnya = 28;

    public void calculateVacationBudget(double v, double p) {
        double budget = (v + p) / rateEuroToHryvnya;
        System.out.println(budget + " Euros");
    }
}
