import java.util.Scanner;

class NhanVien {
    private String name, gender, date, address, tax, d_work;
    public NhanVien(String name, String gender, String date, String address, String tax, String d_work) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.tax = tax;
        this.d_work = d_work;
    }
    public void out(){
        System.out.println("00001" + " " + this.name + " " + this.gender + " " + this.date + " " + this.address + " " + this.tax + " " + this.d_work);
    }
}
public class J04007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        nv.out();
    }
}
