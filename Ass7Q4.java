import java.util.Scanner;

	class Ass7Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            int x = scanner.nextInt();

            System.out.print("Enter the value of y: ");
            int y = scanner.nextInt();

            int difference = x - y;

            if (difference == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            double result = (double) x / difference;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
