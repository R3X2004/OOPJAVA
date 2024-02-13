import java.util.Scanner;
import java.lang.Thread;

class MultiplicationTable implements Runnable {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            
                System.out.println(e);
            }
        }
    }
}

 class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1:");
        int no1 = sc.nextInt();
        System.out.println("Enter no2:");
        int no2 = sc.nextInt();
        System.out.println("Enter no3:");
        int no3 = sc.nextInt();
        

        Thread thread1 = new Thread(new MultiplicationTable(no1));
        Thread thread2 = new Thread(new MultiplicationTable(no2));
        Thread thread3 = new Thread(new MultiplicationTable(no3));

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }
}
