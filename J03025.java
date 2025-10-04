import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            int cnt = 0;
            String s = sc.nextLine();
            for(int j = 0; j < s.length() / 2; j++){
                if(s.charAt(j) != s.charAt(s.length() - j - 1)) cnt ++;
            }
            if(cnt <= 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
