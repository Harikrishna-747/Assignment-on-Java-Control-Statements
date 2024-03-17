public class FirstTenOddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("First 10 odd numbers:");

        // Loop until count reaches 10
        while (count < 10) {
            if (number % 2 != 0) { // Check if the number is odd
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
