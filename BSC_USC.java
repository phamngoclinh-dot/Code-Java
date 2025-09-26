import java.util.*;

public class BSC_USC {
    public static long UCLN(long a, long b){
        if(b == 0) return a;
        return UCLN(b,a % b);
    }
    public static long BCNN(long a, long b){
        return a * b / UCLN(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println(BCNN(a, b) + " " + UCLN(a,b));
        }
    }
}
