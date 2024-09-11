import java.util.Arrays;

public class ArrayExample {
    public static void main() {
        //
        int[] numbers = new int[5]; // initialized with 5 zeros as default array element values
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
//        numbers[30] = 40;// this line causes Java to throw an exception
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 30 out of bounds for length 5
        // at ArrayExample.main(ArrayExample.java:9)

        // or instead we can do the following
        // int[] numbers = {1,2,3,4};

        // printing an array return a string which is calculated based on the address of that array
        System.out.println(numbers); // => [I@7b23ec81
        System.out.println(Arrays.toString(numbers)); // => [1, 2, 3, 4, 0]
        // accessing individual elements
        System.out.println("first element in numbers array:" + numbers[0]);
        System.out.println("array length " + numbers.length); // 5 the number of elements

        int[] orderedNumbers = {1,5,3,6,8,2};
        System.out.println(Arrays.toString(orderedNumbers));
        Arrays.sort(orderedNumbers);
        System.out.println(Arrays.toString(orderedNumbers));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(matrix));
        matrix[1][2] = 99;
        System.out.println(Arrays.deepToString(matrix));
    }
}
