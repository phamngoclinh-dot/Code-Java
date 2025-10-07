import java.util.Scanner;
class point2 {
    public double x,y;

    public point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
public class J04010 {
    public static double Canh(point2 p1, point2 p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            point2 p1 = new point2(sc.nextDouble(), sc.nextDouble());
            point2 p2 = new point2(sc.nextDouble(), sc.nextDouble());
            point2 p3 = new point2(sc.nextDouble(), sc.nextDouble());
            double a = Canh(p1,p2);
            double b = Canh(p1,p3);
            double c = Canh(p3,p2);
            if (a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            }
            else {
                double dt = Math.sqrt((a + b + c)*(a + b - c) * (a - b + c) * (b + c - a))/4;
                double r = a * b * c / ( 4 * dt);
                System.out.println(String.format("%.3f", Math.PI * r * r));
            }
        }
    }
}
