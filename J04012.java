import java.util.Scanner;
class Cong {
    private String ten;
    private int lcb, ngayCong;
    private String chucVu, id;

    public Cong(String ten, int lcb, int ngayCong, String chucVu) {
        this.ten = ten;
        this.lcb = lcb;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    public void out(){
        this.id = "NV01";
        int l = this.lcb * this.ngayCong;
        int Thuong = 0;
        if(this.ngayCong >= 25){
            Thuong = l * 2 / 10;
        }
        else if (this.ngayCong >= 22 && this.ngayCong <= 25){
            Thuong = l * 1 / 10;
        }
        else {
            Thuong = 0;
        }
        int phuCap;
        if (this.chucVu.equals("GD")){
            phuCap = 250000;
        }
        else if (this.chucVu.equals("PGD")){
            phuCap = 200000;
        }
        else if (this.chucVu.equals("TP")){
            phuCap = 180000;
        }
        else{
            phuCap = 150000;
        }
        System.out.println(this.id + " " + this.ten + " " + l + " " + Thuong + " " + phuCap + " " + (l + Thuong + phuCap));
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int lcb = sc.nextInt();
        int ngayCong = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        Cong cong = new Cong(ten, lcb, ngayCong,chucVu);
        cong.out();
    }
}
