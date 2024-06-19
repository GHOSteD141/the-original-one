import java.util.Scanner;

public class leftandrightdiagonalelements {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Left Diagonal elements:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matrix[i][i]);
        }

        System.out.println("Right Diagonal elements:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matrix[i][2 - i]);
            
        }
    scanner.close();
    }
        
}


