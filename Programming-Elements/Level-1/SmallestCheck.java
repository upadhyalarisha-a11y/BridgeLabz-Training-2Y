import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if first is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }

        scanner.close();
    }
}

