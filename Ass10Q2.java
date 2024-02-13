import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string with multiple spaces: ");
            String input = scanner.nextLine();

            String output = removeMultipleSpaces(input);
            System.out.println("Output: " + output);
        } finally {
        }
    }

    public static String removeMultipleSpaces(String input) {
        while (input.indexOf("  ") != -1) {
            input = input.substring(0, input.indexOf("  ")) + input.substring(input.indexOf("  ") + 1);
        }
        return input.trim();
    }
}
