package Patterns;

public class pattern7 {

        public static void main(String args[]) {
            int n = 5;

            int counter = 1;
            //Loop to iterate over each row
            for (int i = 1; i < n; i++) {
                //Loop to iterate over each column
                for (int j = 1; j <= i; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
            }
        }
    }

