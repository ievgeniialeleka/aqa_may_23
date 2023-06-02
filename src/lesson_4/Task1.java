package lesson_4;

public class Task1 {
    static double diff = 2.54;

    public void convertCmToInches(double cm) {
        double cmToInch = cm * diff;
        System.out.println(cm + " centimeters equals " + cmToInch + " inches");
    }

    public void convertInchesToCm(double inch) {
        double inchToCm = inch / diff;
        System.out.println(inch + " inches equals " + inchToCm + " centimeters");
    }
}
