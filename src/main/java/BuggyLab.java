import java.util.InputMismatchException;
import java.util.Scanner;

public class BuggyLab {
    public static void main(String[] args) {

        // Create a Scanner to take in user input
        Scanner scanner = new Scanner(System.in);

        // Bug One
        // Prompt the user for a number - this number can be a decimal number
        System.out.println("Please enter a number");
        int userNumber = scanner.nextInt();

        // Bug Two
        // Compare if 10.5 is greater than or equal to the user input number
        System.out.println("Let's compare your number against the number 10.5!");
        boolean isGreater = userNumber > 10.5;
        System.out.println("Is your number, " + userNumber + " greater than or equal to 10.5?");
        System.out.println("The answer is: " + isGreater);
    }
}
