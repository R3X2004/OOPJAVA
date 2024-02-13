import java.util.Scanner;

public class Ass7Q3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index position: ");
        int index = scanner.nextInt();
        
        try {
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index position. Please enter a valid index.");
        }
    }
}
