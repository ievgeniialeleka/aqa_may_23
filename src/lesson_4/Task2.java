package lesson_4;

public class Task2 {
//    public static void main(String[] args) {
//        double vasya = 5000;
//        double parents = 5000;
//        int rateEurotoHryvnya = 28;
//        double vacationBudgetInEuros = (vasya + parents) / rateEurotoHryvnya;
//        System.out.println(vacationBudgetInEuros + " Euro");
//        System.out.println();
//    }

    static int rateEuroToHryvnya = 28;

    public void calculateVacationBudget(double v, double p) {
        double budget = (v + p) / rateEuroToHryvnya;
        System.out.println(budget + " Euros");
    }
}
