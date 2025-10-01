import java.util.Scanner;

public class J03006 {
    public static boolean Thuan_Nghich(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    public static boolean CS_Chan(String s){
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') % 2 != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            if(Thuan_Nghich(s) && CS_Chan(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
