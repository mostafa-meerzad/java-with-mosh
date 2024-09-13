public class TypeCasting {
    public static void main() {
        short num = 10;
        int sum = num + 50; // here num's type is converted to int implicitly which always goes upwards
        float d = 1.5f;
        int total = (int)d + 100; // d is explicitly cast to int, here we lose the decimal part

        String userInput = "10";
        int result = Integer.parseInt(userInput) * 2;
//        Short.parseShort();
//        Float.parseFloat();
//        Double.parseDouble();
        System.out.println(result);
    }
}
