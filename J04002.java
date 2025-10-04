import java.util.Objects;
import java.util.Scanner;
class Canh {
    private int Dai, Rong;
    private String Color;

    public Canh(int dai, int rong, String color) {
        Dai = dai;
        Rong = rong;
        Color = color;
    }
    public void out(){
        if ( this.Dai <= 0 || this.Rong <= 0){
            System.out.println("INVALID");
        }
        else {
            this.Color = this.Color.toLowerCase();
            String tmp = this.Color.substring(0,1);

            this.Color = tmp.toUpperCase() + this.Color.substring(1);
            System.out.println(((this.Dai + this.Rong) * 2) + " " + (this.Dai * this.Rong) + " " + this.Color);
        }
    }
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Canh c = new Canh(sc.nextInt(), sc.nextInt(), sc.next());
        c.out();
    }
}
