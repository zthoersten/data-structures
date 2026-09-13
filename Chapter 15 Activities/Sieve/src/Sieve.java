import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        
        SortedSet<Integer> primes = new TreeSet<>();
        for (int i = 2; i < n; i++) {
            primes.add(i);
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primes.remove(i);
                    break;
                }
            }
        }
        
        System.out.println(primes);
    }
}