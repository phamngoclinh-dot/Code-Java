import java.util.*;

public class TamGiacRong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < 2*n - 1; j++){
                if(j == n - 1 - i || i == n - 1 || (j == i + n - 1 )){
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }

    }
}
