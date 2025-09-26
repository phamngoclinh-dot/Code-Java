import java.util.Scanner;

public class ThuaSoNT {
    public static void Tinh(int n){
        for(int i = 2; i * 1 <= n; i++){
            if(n % i == 0){
                int cnt = 0;
                while(n % i == 0){
                    cnt++;
                    n /= i;
                }
                System.out.printf("%d(%d) ", i, cnt);
            }
        }
        if(n > 1) System.out.printf("%d(%d) ", n, 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            System.out.printf("Test %d: ", i + 1);
            Tinh(n);
            System.out.println("");
        }
    }
}
