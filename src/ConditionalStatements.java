import org.w3c.dom.ls.LSOutput;

public class ConditionalStatements {
    public static void main() {
        // todo
        // if temp is greater than 30
        //     it's a hot day
        //     drink plenty of water
        // otherwise if it's between 20 and 30
        //     it's a nice day
        // otherwise
        // it's cold

        int temp = 32;
//        if (temp > 30) {
//            System.out.println("it's a hot day");
//            System.out.println("drink plenty of water!");
//        } else if (temp > 20 && temp < 30) {
//            System.out.println(" beautiful day");
//        } else {
//            System.out.println("cold day");
//        }
// format your code so it's easier to read, "{}" are not needed if the there is one line of code to in the block
        if (temp > 30) {
            System.out.println("it's a hot day");
            System.out.println("drink plenty of water!");
        } else if (temp > 20)
            System.out.println(" beautiful day");
        else
            System.out.println("cold day");
//----------------------------------------------
//        int income = 120_0000;
//        boolean highIncome = false;
//        if (income > 100_000) {
//            highIncome = true;
//        } else {
//            highIncome = false;
//        }

//        System.out.print("do we have highIncome: ");
//        System.out.println(highIncome);

        // simplify the code above

        int income = 120_000;
        boolean highIncome = income > 100_000;

        if (highIncome)
            System.out.println("high income");
        else
            System.out.println("low income");

        // use ternary operator

        String className = income > 100_000 ? "first" : "economy";
    }
}
