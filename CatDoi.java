import java.util.*;

public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            boolean ok = true;
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '0' || c == '8' || c == '9') {
                    result.append('0');
                } else if (c == '1') {
                    result.append('1');
                } else {
                    ok = false;
                    break;
                }
            }

            String res = result.toString().replaceFirst("^0+", ""); // bỏ số 0 ở đầu
            if (!ok || res.isEmpty()) {
                System.out.println("INVALID");
            } else {
                System.out.println(res);
            }
        }
    }
}