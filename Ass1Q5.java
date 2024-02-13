import java.lang.*;
import java.util.Scanner;

public class Ass1Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of M: ");
        int m = input.nextInt();

        System.out.print("Enter the value of N: ");
        int n = input.nextInt();

        int count = 0;
        int sum = 0;

        System.out.println("Numbers between " + m + " and " + n + " that are divisible by 3 and 5:");

        for (int i = m; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        System.out.println("\nTotal count of numbers divisible by 3 and 5: " + count);
        System.out.println("Sum of numbers divisible by 3 and 5: " + sum);

    
    }
}
