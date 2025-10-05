import java.util.ArrayList;
import java.util.Scanner;

class Time {
    public int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Time> l = new ArrayList<>();
        for(int i = 0; i < t; i++){
            l.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        l.sort((A,B) -> {
            if (A.h != B.h) return Integer.compare(A.h, B.h);
            if (A.m != B.m) return Integer.compare(A.m, B.m);
            return Integer.compare(A.s, B.s);
        });
        for(Time x : l){
            System.out.println(x.h + " " + x.m + " " + x.s);
        }
    }
}
