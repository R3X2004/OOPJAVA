import java.lang.*;
import java.util.Scanner;

public class Ass2Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        int[] arr = new int[10];

        
        System.out.println("Enter 10 numbers:");

        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number to be searched:");

        
        int num = sc.nextInt();

        
        int pos = -1;

        
        for (int i = 0; i < 10; i++) {
            
            if (arr[i] == num) {
                pos = i;
                break;
            }
        }

        
        if (pos == -1) {
            
            System.out.println("The number " + num + " is not found in the array.");
        } else {
            
            System.out.println("The number " + num + " is found in the array at position " + pos + ".");
        }

        
       
    }
}
