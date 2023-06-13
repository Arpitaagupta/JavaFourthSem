package Assignment1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;

        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a value for n: ");
            n = scanner.nextInt();
        } else {
            n = Integer.parseInt(args[0]);
        }

        if (n <= 0) {
            System.out.println("n must be greater than 0");
            return;
        }

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = i+1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

