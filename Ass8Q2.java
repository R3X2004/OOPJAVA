import java.util.Scanner;
class SquareThread extends Thread {
    private int number;

    public SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

class FactorialThread extends Thread {
    private int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

class Ass8Q2 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        
		

        SquareThread squareThread = new SquareThread(number);
        FactorialThread factorialThread = new FactorialThread(number);

        squareThread.start();
        factorialThread.start();
    }
}

