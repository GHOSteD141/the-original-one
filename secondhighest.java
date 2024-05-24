import java.util.Scanner;
import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("The second highest number is: " + numbers[8]);

        scanner.close();
    }
}
