import java.util.*;
public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int m = sc.nextInt(), n = sc.nextInt();
            int[][] a = new int[m][n], b = new int[n][m];
            for(int j = 0; j < m; j++){
                for(int k = 0; k < n; k++){
                    a[j][k] = sc.nextInt();
                    b[k][j] = a[j][k];
                }
            }
//            int[][] c = new int[m][m];
            System.out.println("Test " + (i + 1) + ":");
            for(int j = 0; j < m; j++){
                for(int k = 0; k < m; k++){
                    int sum = 0;
                    for(int y = 0; y < n; y++){
                        sum += a[k][y]*b[y][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
    }
}
