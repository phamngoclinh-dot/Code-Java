import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int maxR = 0;
        for(int i = 0; i < n; i++){
            maxR = Math.max(maxR, a[i]);
        }
        int[] b = new int[maxR + 1];
        for(int i = 0; i < n; i++){
            b[a[i]]++;
        }
        boolean ok = true;
        for(int i = 1; i <= maxR; i++){
            if(b[i] == 0){
                ok = false;
                System.out.println(i);
            }
        }
        if(ok) System.out.println("Excellent!");
    }
}
