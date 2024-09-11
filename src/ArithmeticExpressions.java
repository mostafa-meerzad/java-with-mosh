public class ArithmeticExpressions {
    public static void main() {

        int a = 10;
        int b = 20;
        int c = 5;

        // basics
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / c;
        int remainder = b % c;

        System.out.println("sum :" + sum);
        System.out.println("difference :" + difference);
        System.out.println("product :" + product);
        System.out.println("qoutient :" + quotient);
        System.out.println("remainder :" + remainder);

        // integer division
        System.out.println(10 / 3); // integer division the decimal part is ignored
        System.out.println(10.0 / 3); // floating-point division if at least one operand has decimal point
        // the result will be a floating-point division
    }
}
