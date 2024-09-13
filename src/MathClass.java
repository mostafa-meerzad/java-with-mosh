public class MathClass {
    public static void main() {
        float rounded = Math.round(123.57);
        System.out.println(rounded);
        int ceil = (int) Math.ceil(1.1); // ceiling of 1.1 is 1 but the Math.ceil returns a double, cast to int
        System.out.println(ceil);

        int sqrt = (int) Math.sqrt(8);// Math.sqrt return double here need to convert to int
        System.out.println(sqrt);
        int max = Math.max(1, 10);
        System.out.println(max);
        //int rand =(int) Math.random(); // the result of casting Math.random to int is always 0
        //int rand = (int) Math.round(Math.random() * 100); // random value 1 to 100 int
        //int rand = (int) (Math.random() * 100); // random value 1 to 100 int
        double rand = Math.random() * 100; // random value 1 to 100 double
        //double rand = Math.random(); // random value 0 to 1
        System.out.println(rand);

    }

}
