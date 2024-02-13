import java.lang.*;
import java.util.Scanner;

public class Ass2Q2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the size of the array:");

        
        int N = sc.nextInt();

        
        int[] arr = new int[N];

        
        System.out.println("Enter " + N + " numbers:");

        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        
        System.out.println("The sorted array in descending order is:");

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        
      
    }
}
