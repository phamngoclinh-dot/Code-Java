import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int [][] a = new int[n][3];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
            if(sum > 1) cnt++;
        }
        System.out.println(cnt);
    }
}
