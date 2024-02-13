import java.lang.*;
import java.util.Scanner;

class Number {
    private int num;

    public void setNum(int n) {
        num = n;
    }

    public void displayNum() {
        System.out.println("Number: " + num);
    }

    int factorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    int sumOfDigit() {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    int reverseNum() {
        int rev = 0;
        int temp = num;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev;
    }
}

	class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n = new Number();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        n.setNum(num);
        n.displayNum();
        System.out.println("Factorial: " + n.factorial());
        if (n.isPrime()) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        System.out.println("Sum of digits: " + n.sumOfDigit());
        System.out.println("Reverse number: " + n.reverseNum());
        sc.close();
    }
}
