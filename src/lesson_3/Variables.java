package lesson_3;

public class Variables {
    public static void main(String[] args) {

        //char
        char c = 'A';
        System.out.println("Char is " + c);
        System.out.println();

        //Integers
        byte b = 125;
        System.out.println("Byte is " + b);
        short s = 32760;
        System.out.println("Short is " + s);
        int i = 123456;
        System.out.println("Integer is " + i);
        long l = 1234567890L;
        System.out.println("Long is " + l);
        System.out.println();

        //Float
        float f = 5.123456f;
        System.out.println("Float is " + f);
        double d = 7.123456789012345d;
        System.out.println("Double is " + d);
        System.out.println();

        //Boolean
        boolean bt = true;
        System.out.println("Boolean can be " + bt);
        boolean bf = false;
        System.out.println("Boolean can be " + bf);
        System.out.println();

        //Arithmetic operations

        int a = 18;
        int k = 3;

        //Addition
        int sum = a + k;
        System.out.println("Sum of " + a + " and " + k + " is " + sum);

        //Subtraction
        int sub = a - k;
        System.out.println("Difference between " + a + " and " + k + " is " + sub);

        //Multiplication
        int prod = a * k;
        System.out.println("Product of " + a + " and " + k + " is " + prod);

        //Division
        //k = 0;
        try {
            int div = a / k;
            System.out.println("Quotient of " + a + " and " + k + " is " + div);
        }
        catch (ArithmeticException exc) {
            System.out.println(exc.fillInStackTrace());
        }


    }
}
