package Assignment1;

public class PatternPrinter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

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
