import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a = s1.split(" ");
            Arrays.sort(a);
            String[] b = s2.split(" ");
            TreeSet<String> ts = new TreeSet<>();
            for(int j = 0 ; j < b.length; j++){
                ts.add(b[j]);
            }
            for(int j = 0; j < a.length; j++){
                if(!ts.contains(a[j]))
                    System.out.print(a[j] + " ");
                ts.add(a[j]);
            }
            System.out.println();
        }
    }
}
