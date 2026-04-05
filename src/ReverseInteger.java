import java.util.Scanner;

public class ReverseInteger {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Prompt the user for input
                int n = scanner.nextInt();

                int reversedN = 0;

                // Process the number until it becomes 0
                while (n > 0) {
                        // Get the last digit
                        int digit = n % 10;
                        // Append the digit to the reversed number
                        reversedN = (reversedN * 10) + digit;
                        // Remove the last digit from n
                        n = n / 10;
                }

                System.out.println(reversedN);

                scanner.close();
        }
}