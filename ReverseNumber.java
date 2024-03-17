import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number as a string
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        // Call the function to reverse the number
        String reversedNumber = reverse(number);

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Function to reverse a number (treats it as a string)
    public static String reverse(String num) {
        StringBuilder reversedNum = new StringBuilder(num);
        return reversedNum.reverse().toString();
    }
}
