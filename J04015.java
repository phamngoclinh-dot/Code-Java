import java.util.Scanner;
class Luong {
    public String id, name;
    public int salary;

    public Luong(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class J04015 {
    public static void TinhLuong(Luong A){
        String ChucVu = A.id.substring(0, 2);
        int HeSo = Integer.parseInt(A.id.substring(2));
        int PhuCap, TongLuong;
        if(ChucVu.equals("HT")) PhuCap = 2000000;
        else if (ChucVu.equals("HP")) {
            PhuCap = 900000;
        } else {
            PhuCap = 500000;
        }
        System.out.println(A.id + " " + A.name + " " + HeSo + " " + PhuCap + " " + (A.salary*HeSo + PhuCap));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Luong l = new Luong(sc.nextLine(), sc.nextLine(), sc.nextInt());
        TinhLuong(l);
    }
}
