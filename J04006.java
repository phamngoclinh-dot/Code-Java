import java.util.Scanner;

public class J04006 {
    public static String ChuanHoa(String str){
        String[] s = str.split("/");
        String d = s[0], m = s[1], y = s[2];
        if(d.length() == 1) d = "0" + d;
        if(m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }
    static class SinhVien {
        private String name, clas,  date;
        private double gpa;

        public SinhVien(String name, String clas, String date, double gpa) {
            this.name = name;
            this.clas = clas;
            this.date = date;
            this.gpa = gpa;
        }
        public void out(){
            System.out.println("B20DCCN001 " + this.name + " " + this.clas + " " + ChuanHoa(this.date) + " " + String.format("%.2f", this.gpa));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        sv.out();
    }
}
