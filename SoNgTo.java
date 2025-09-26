import java.util.*;

public class SoNgTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            long n = sc.nextLong();
            boolean ok = true;
            if(n < 2) ok = false;
            else{
                for(int j = 2; j <= Math.sqrt(n); j++){
                    if(n % j == 0){
                        ok = false;
                        break;
                    }
                }
            }
            if(ok) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
