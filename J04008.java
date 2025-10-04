import java.util.Scanner;

class Point {
    public double p1, p2;

    public Point(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}

public class J04008 {
    public static double DoDai(Point A, Point B){
        return Math.sqrt((A.p1 - B.p1) * (A.p1 - B.p1) +(A.p2 - B.p2) * (A.p2 - B.p2));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());
            double a = DoDai(C,B), b = DoDai(A,C), c = DoDai(A,B);
            if(a + b <= c || a + c <= b || b + c <= a){
                System.out.println("INVALID");
            }
            else {
                System.out.println(String.format("%.3f", a + b + c));
            }

        }
    }
}
