import java.util.Scanner;

public class EvenNumbersBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range (x and y)
        System.out.print("Enter the starting number (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter the ending number (y): ");
        int y = scanner.nextInt();

        System.out.println("Even numbers between " + x + " and " + y + ":");

        // Call the function to display even numbers
        displayEvenNumbersBetween(x, y);
    }

    // Function to display even numbers between x and y
    public static void displayEvenNumbersBetween(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline after the loop
    }
}