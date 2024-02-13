import java.lang.*;
import java.util.Scanner;

public class Ass1Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        double sum = 1;
        double term = 1;
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        System.out.println("The sum of the exponential series is: " + sum);
    }
}
