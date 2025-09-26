import java.util.*;

public class TongUocSo_1 {
    static int MAX = 2000000;
    static int[] spf = new int[MAX + 1];

    public static void sieve() {
        for (int i = 2; i <= MAX; i++) spf[i] = i;
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
    }


    public static long tong(int x) {
        long sum = 0;
        while (x > 1) {
            sum += spf[x];
            x /= spf[x];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sieve();

        long result = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            result += tong(num);
        }

        System.out.println(result);
    }
}
