import java.util.Scanner;

	class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, result;

        try {
            System.out.print("Enter the first number (n1): ");
            n1 = scanner.nextInt();

            System.out.print("Enter the second number (n2): ");
            n2 = scanner.nextInt();

            result = n1 / n2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Please enter a non-zero value for n2.");
        }
    }
}
