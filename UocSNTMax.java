import java.util.*;

public class UocSNTMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long prime = -1;
            while (n % 2 == 0) {
                prime = 2;
                n /= 2;
            }

            for (long i = 3; i * i <= n; i += 2) {
                while (n % i == 0) {
                    prime = i;
                    n /= i;
                }
            }

            if (n > 2) prime = n;

            System.out.println(prime);
        }
    }
}
