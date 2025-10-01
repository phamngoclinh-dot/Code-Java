import java.util.Scanner;

public class J03008 {
    public static boolean Thuan_Nghich(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    public static boolean Nguyen_To(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Nguyen_To(s.charAt(i) - '0')) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            if(Thuan_Nghich(s) && check(s))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
