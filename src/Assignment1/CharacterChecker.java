package Assignment1;
import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Uppercase characters: " + uppercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCount);
        System.out.println("Digits: " + digitCount);
        System.out.println("Other characters: " + otherCount);
    }
}

