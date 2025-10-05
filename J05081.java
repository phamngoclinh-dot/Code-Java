import java.util.ArrayList;
import java.util.Scanner;
class MatHang {
    public String name, unit;
    public int buy, sale;
    public String id;
    public int profit, stt;

    public MatHang(String name, String unit, int buy, int sale) {
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sale = sale;
    }
}
public class J05081 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> mh = new ArrayList<>();
        for(int i = 0; i < t; i++){

            MatHang x = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            x.id = "MH" + String.format("%03d",i + 1);
            x.stt = i + 1;
            x.profit = x.sale - x.buy;
            mh.add(x);
            sc.nextLine();
        }
        mh.sort((a,b) -> {
            if(a.profit == b.profit) return Integer.compare(a.stt, b.stt);
            return Integer.compare(b.profit, a.profit);
        });
        for(MatHang x : mh){
            System.out.println(x.id + " " + x.name + " " + x.unit + " " + x.buy + " " + x.sale + " " + x.profit);
        }
    }
}
