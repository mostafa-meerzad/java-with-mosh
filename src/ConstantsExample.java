public class ConstantsExample {

    public static void main(String[] args) {
        // Defining constants
        final double PI = 3.14159;  // Common constant (static for sharing across instances)
        final int MAX_USERS = 100;  // Application-wide constant
        // Using constants in calculations
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);

        System.out.println("Maximum number of users allowed: " + MAX_USERS);
    }
}