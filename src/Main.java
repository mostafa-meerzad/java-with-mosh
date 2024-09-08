public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int myAge = 24; // int for a person's age is an overkill
        byte hisAge = 30; // byte is more than enough for storing values like age
        int maxInt = 2_123_456_789; // int type is sufficient for up 3 billion but not 3 billion
//        int billions = 3_000_000_000;// Integer number too large
        long viewsCount = 3_123_456_789L;// long numbers must be suffixed with L or l
        double smallDouble = 10.99; // double is too large for storing such small decimal value
        float price = 10.99F; // small-decimal (float) values must be suffixed with F or f
        char letter = 'A'; // single characters must have char type and be surrounded with single-quotes('') otherwise
        // get an error
        boolean isViral = false;
        String message = "Hello World";
        String testStr = new String("just a string value");// this is how to define a string value in Java but
//        since it's commonly used the first way is used but under the hood the first and second approaches are the same
        System.out.println(message.indexOf("H") + " is the index of H");

        System.out.println(message.endsWith("d")); // this would result a boolean value
        System.out.println(myAge);
        System.out.println(message);

        String newMessage = message.replace(" ", "*"); // calling replace method returns a new modified copy of string
        System.out.println(newMessage);

        String rawInput = "  Hello Java  ";
        System.out.println(rawInput);
        System.out.println(rawInput.trim()); // trim method removes the white-space characters from both ends of the string


    }
}