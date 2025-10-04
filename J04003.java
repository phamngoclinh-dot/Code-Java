import java.util.*;

class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void out(){
        long t = gcd(this.tu, this.mau);
        System.out.println((this.tu / t) + "/" + (this.mau/t));
    }

}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps = new PhanSo(sc.nextLong(), sc.nextLong());
        ps.out();
    }
}
