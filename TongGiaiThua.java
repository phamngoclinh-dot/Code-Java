import java.util.Scanner;

public class TongGiaiThua {
    public static long gt(long n){
        long sum = 1;
        for(int i = 2; i <= n; i++){
            sum *= i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        for(int i = 1; i <= n; i++){
            tong += gt(i);
        }
        System.out.println(tong);
    }
}
