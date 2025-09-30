import java.util.*;

public class J02020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[k + 1];
        for(int i = 1; i <= k; i++) a[i] = i;
        int cnt = 0;
        while(true){
            for(int i = 1; i <= k; i++){
                System.out.print(a[i] + " ");
            }
            cnt++;
            System.out.println();
            boolean ok = true;
            for(int i = k; i >= 1; i--){
                if(a[i] != n - k + i){
                    ok = false;
                    a[i] += 1;
                    for(int j = i + 1; j <= k; j++){
                        a[j] = a[j - 1] + 1;
                    }
                    break;
                }
            }
            if(ok) break;
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
