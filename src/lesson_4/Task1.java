package lesson_4;

public class Task1 {
//    public static void main(String[] args) {
//        //Task1
//        double cm = 10;
//        double inch = 25;
//        double diff = 2.54;
//        double cmToInch = cm * diff;
//        double inchToCm = inch / diff;
//        System.out.println(cm + " centimeters equals " + cmToInch + " inches");
//        System.out.println(inch + " inches equals " + inchToCm + " centimeters");
//        System.out.println();
//    }
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
