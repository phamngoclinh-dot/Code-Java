import java.util.Scanner;
class Point1 {
public double x, y;

public Point1(double x, double y) {
        this.x = x;
        this.y = y;
        }
        }
public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            Point1 sv1 = new Point1(sc.nextFloat(), sc.nextFloat());
            Point1 sv2 = new Point1(sc.nextFloat(), sc.nextFloat());
            System.out.println(String.format("%.4f", Math.sqrt((sv1.x - sv2.x) * (sv1.x - sv2.x) + (sv1.y - sv2.y) * (sv1.y - sv2.y))));
        }
    }
}
