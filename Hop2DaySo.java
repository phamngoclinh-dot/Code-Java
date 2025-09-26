import java.util.*;

public class Hop2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] a = new int[m], b = new int[n];
        for(int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        TreeSet<Integer> t = new TreeSet<>();
        for(int i = 0; i < m; i++) t.add(a[i]);
        for(int i = 0; i < n; i++) t.add(b[i]);
        for(int x : t){
            System.out.print(x + " ");
        }
    }
}
