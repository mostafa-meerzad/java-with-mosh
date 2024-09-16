public class LogicalOperators {
    public static void main(String[] args) {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
//        boolean isEligible = hasHighIncome || hasGoodCredit; // => true
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // => true
        System.out.println(isEligible); //=> true

    }
}
