import java.lang.*;
import java.util.Scanner;

class Account

{
    int accNo, time;
    float balance;
    static float intRate = 0.075f;

    Account(int an, float bal, int t) {
        accNo = an;
        balance = bal;
        time = t;
    }

    float calculateInterst() {
        return (balance * time * intRate);
    }

    void showAccDetails() {
        System.out.println(accNo + "\t\t" + balance + "\t " + calculateInterst());
    }

    static void changeIntRate(float newRate) {
        intRate = newRate;
    }
}

class TestAccount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int an, t, n;
        float rate, bal;
        System.out.print("\n Enter the nunmber of Account = ");
        n = sc.nextInt();
        Account a[] = new Account[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n Enter the details of Account " + (i + 1) + " : ");
            System.out.print("Enter the Account Number : ");
            an = sc.nextInt();
            System.out.print("Enter the Account Balance : ");

            bal = sc.nextFloat();

            System.out.print("Enter the Number of Time in Years : ");
            t = sc.nextInt();
            a[i] = new Account(an, bal, t);
        }
        System.out.println("Account No." + "\t" + "Balance" + "\t" + "Interest");
        for (int i = 0; i < n; i++) {
            a[i].showAccDetails();
        }
        System.out.print("\n Enter the new Interest Rate = ");
        rate = sc.nextFloat();
        Account.changeIntRate(rate);
        System.out.println("Updated Account Details ..");
        System.out.println("Account No." + "\t" + "Balance" + "\t" + "Interest");
        for (int i = 0; i < n; i++) {
            a[i].showAccDetails();
        }
    }
}