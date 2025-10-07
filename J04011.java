import java.util.Scanner;

class Point3D {
    public int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int v1x = p2.x - p1.x, v1y = p2.y - p1.y, v1z = p2.z - p1.z;
        int v2x = p3.x - p1.x, v2y = p3.y - p1.y, v2z = p3.z - p1.z;
        int v3x = p4.x - p1.x, v3y = p4.y - p1.y, v3z = p4.z - p1.z;

        int cx = v1y * v2z - v1z * v2y;
        int cy = v1z * v2x - v1x * v2z;
        int cz = v1x * v2y - v1y * v2x;

        int dot = cx * v3x + cy * v3y + cz * v3z;
        return dot == 0;
    }
}

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            if (Point3D.check(p1, p2, p3, p4)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
