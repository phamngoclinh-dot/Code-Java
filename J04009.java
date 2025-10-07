import java.util.Scanner;
class Point2 {
    public double x,y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
public class J04009 {
    public static double Canh(Point2 p1, Point2 p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            Point2 p1 = new Point2(sc.nextDouble(), sc.nextDouble());
            Point2 p2 = new Point2(sc.nextDouble(), sc.nextDouble());
            Point2 p3 = new Point2(sc.nextDouble(), sc.nextDouble());
            double a = Canh(p1,p2);
            double b = Canh(p1,p3);
            double c = Canh(p3,p2);
            if (a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            }
            else {
                double dt = Math.sqrt((a + b + c)*(a + b - c) * (a - b + c) * (b + c - a))/4;
                System.out.println(String.format("%.2f", dt));
            }
        }
    }
}
