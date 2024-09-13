import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object
//        System.out.print("Your age: ");
//        short age = scanner.nextShort(); // to get an input of type short
//        System.out.println("you are " + age);
        System.out.print("Your name: ");
//        String name = scanner.nextLine(); // read a line of string including whitespaces
        String name = scanner.next(); // read a string no whitespace is included
        System.out.println("Your name is " + name);
    }
}
