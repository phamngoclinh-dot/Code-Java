import java.util.Scanner;
public class HCN {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a <= 0 || b <= 0){
                System.out.println("0");
            }
            else {
                int chuVi = 2 * (a + b);
                int dienTich = a * b;
                System.out.println(chuVi + " " +dienTich);
            }
    }
}
