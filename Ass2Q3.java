import java.lang.*;
import java.util.Scanner;

public class Ass2Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        int j = 0; 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i]; 
            }
        }
        arr[j++] = arr[n - 1]; 
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
