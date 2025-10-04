import java.util.Scanner;

class ThiSinh {
    private String name, date;
    private double p1,p2,p3;

    public ThiSinh(String name, String date, double p1, double p2, double p3) {
        this.name = name;
        this.date = date;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public void out(){
        System.out.println(this.name + " " + this.date + " " + String.format("%.1f", this.p1 + this.p2 + this.p3));
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        ts.out();
    }
}
