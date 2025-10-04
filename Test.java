import java.util.*;

class PhanSo1 {
    public long tu, mau;

    public PhanSo1(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
}
public class Test {
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void out(PhanSo1 A, PhanSo1 B){
        PhanSo1 C = new PhanSo1(0,0);
        C.tu = A.tu * B.mau + A.mau * B.tu;
        C.mau = A.mau * B.mau;
        long t = gcd(C.tu, C.mau);
        System.out.println((C.tu/t) + "/" + (C.mau/t));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo1 A = new PhanSo1(sc.nextLong(), sc.nextLong());
        PhanSo1 B = new PhanSo1(sc.nextLong(), sc.nextLong());
        out(A,B);
    }
}
