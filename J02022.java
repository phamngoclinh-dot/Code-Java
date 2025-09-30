import java.util.*;

public class J02022 {
    static int n;
    static boolean[] used = new boolean[15];
    static int[] x = new int[15];

    public static void backtrack(int i) {
        if (i > n) {
            // In kết quả
            for (int j = 1; j <= n; j++) {
                System.out.print(x[j]);
            }
            System.out.println();
            return;
        }
        for (int j = 1; j <= n; j++) {
            if (!used[j]) {
                if (i > 1 && Math.abs(j - x[i - 1]) == 1) continue;
                x[i] = j;
                used[j] = true;
                backtrack(i + 1);
                used[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            Arrays.fill(used, false);
            backtrack(1);
            System.out.println();
        }
    }
}
