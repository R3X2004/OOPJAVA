import java.util.Scanner;

class Ass10Q3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        
        String input = in.nextLine();
        
        
        System.out.println(capitalize(input));
    }

    
    public static String capitalize(String input) {
        StringBuilder output = new StringBuilder();
        String[] words = input.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            output.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        
        return output.toString().trim();
    }
}
