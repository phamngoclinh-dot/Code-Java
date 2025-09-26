import java.util.Scanner;

public class HinhThoiRong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 2 * n - 1; i++){
            for(int j = 0; j < 2 * n - 1; j++){
                if(j == n - 1 - i || i == n - 1 + j || j == i + n - 1 || i + j == 3*(n - 1)){
                    System.out.printf("*");
                }
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }
}
