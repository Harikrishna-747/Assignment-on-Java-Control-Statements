import java.util.Scanner;

public class NumberToWords {
    // Array to store words for digits from 0 to 9
    private static final String[] words = {
        "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the number in words
        System.out.println("Number in words:");
        displayNumberInWords(number);
    }

    // Function to display a number in words
    public static void displayNumberInWords(int num) {
        // Convert the number to a string to iterate over each digit
        String numberStr = String.valueOf(num);
        
        // Iterate over each digit of the number and print its word
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            System.out.print(words[digit] + " ");
        }
        System.out.println(); // Print a newline after displaying all digits
    }
}
