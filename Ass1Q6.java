import java.lang.*;
public class Ass1Q6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 37; i <= 129; i++) {
            boolean isPrime = true; 
            for (int j = 2; j <= Math.sqrt(i); j++) { 
                if (i % j == 0) { 
                    isPrime = false; 
                    break; 
                }
            }
            if (isPrime) { 
                count++;
            }
        }
        System.out.println("The number of primes between 37 and 129 is: " + count);
    }
}
