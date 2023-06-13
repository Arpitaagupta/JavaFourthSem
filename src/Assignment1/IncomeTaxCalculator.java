package Assignment1;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee's earnings: ");
        double earnings = input.nextDouble();

        double tax = 0;

        if (earnings <= 50000) {
            tax = 0;
        } else if (earnings > 50000 && earnings <= 60000) {
            tax = (earnings - 50000) * 0.1;
        } else if (earnings > 60000 && earnings <= 150000) {
            tax = 10000 + (earnings - 60000) * 0.2;
        } else if (earnings > 150000) {
            tax = 37000 + (earnings - 150000) * 0.3;
        }

        System.out.println("The income tax to be paid by the employee is: " + tax);
    }}
