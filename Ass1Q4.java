//java program for checking a number prime or composite
import java.lang.*;
import java.util.Scanner;
public class Ass1Q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or composite");
        int n = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is composite");
        }
    }
}