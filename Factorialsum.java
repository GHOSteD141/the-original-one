import java.util.Scanner;

public class Factorialsum
 
{
    public static void main(String[] args)
 
{
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        long sum = 0;  // Use long to handle large factorials

        for (int i = 1; i <= N; i++) 
        {
            long factorial = 1;
            for (int j = 1; j <= i; j++)
             {
                factorial = j* factorial;  // Calculate factorial
            }
            sum = factorial+sum;  // Add factorial to sum
        }

        System.out.println("The sum of the series S = 1! + 2! + ... + " + N + "! facorial val is  " + sum);
        sc.close();
    }
}