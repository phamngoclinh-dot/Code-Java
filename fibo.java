import java.util.*;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[]  arr = new long[95];
        arr[1] = 0;
        arr[2] = 1;
        for(int i = 3; i <= 92; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            long n = sc.nextLong();
            boolean ok = false;
            for(int j = 1; j <= 92; j++){
                if(n == arr[j]){
                    ok = true;
                    break;
                }
            }
            if(ok) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
