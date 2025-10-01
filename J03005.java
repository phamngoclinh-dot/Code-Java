import java.util.Locale;
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine().trim();
            String[] s = str.split("\\s+");
            for(int j = 0; j < s.length; j++){
                if(j == 0){
                    s[j] = s[j].toUpperCase();
                }
                else{
                    s[j] = s[j]. toLowerCase();
                    String first_char = s[j].substring(0,1);
                    first_char = first_char.toUpperCase();
                    s[j] = first_char + s[j].substring(1);
                }
            }
            for(int j = 1; j < s.length; j++){
                if(j != s.length - 1){
                    System.out.print(s[j] + " ");
                }
                else{
                    System.out.print(s[j] + ", ");
                }
            }
            System.out.println(s[0]);
        }
    }
}
