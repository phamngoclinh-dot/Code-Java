import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim().toLowerCase();
            String[] parts = line.split("\\s+");
            String name = parts[parts.length - 1];
            StringBuilder sb = new StringBuilder(name);
            for (int j = 0; j < parts.length - 1; j++) {
                sb.append(parts[j].charAt(0));
            }
            String email = sb.toString();
            count.merge(email, 1, Integer::sum);
            if (count.get(email) == 1) {
                System.out.println(email + "@ptit.edu.vn");
            } else {
                System.out.println(email + count.get(email) + "@ptit.edu.vn");
            }
        }
    }
}