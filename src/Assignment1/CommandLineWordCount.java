package Assignment1;

public class CommandLineWordCount {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a command line argument.");
        } else {
            String argument = args[0];
            int wordCount = countWords(argument);
            System.out.println("The number of words in the argument is: " + wordCount);
        }
    }

    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
