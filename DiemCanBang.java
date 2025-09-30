import java.util.*;

public class DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sumr = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                sumr += a[j];
            }
            int suml = 0;
            int idx = -2;
            sumr -= a[0];
            if (sumr == suml) {
                System.out.println(1);
                continue;
            }
            for (int j = 1; j < n; j++) {
                sumr -= a[j];
                suml += a[j - 1];
                if (suml == sumr) {
                    idx = j;
                    break;
                }
            }
            System.out.println(idx + 1);
        }
    }
}
