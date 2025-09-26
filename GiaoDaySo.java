import java.util.*;

public class GiaoDaySo {
    static boolean check(int[] a, int n, int x){
        for(int i = 0; i < n; i++){
            if(a[i] == x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] A = new int[a];
        int[] B = new int[b];
        for(int i = 0; i < a; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < b; i++){
            B[i] = sc.nextInt();
        }
        TreeSet<Integer> t = new TreeSet<>();
        for(int i = 0; i < a; i++){
            if(check(B, b, A[i])){
                t.add(A[i]);
            }
        }
        for(int x : t){
            System.out.print(x + " ");
        }
    }
}
