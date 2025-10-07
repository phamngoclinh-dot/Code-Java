import java.util.ArrayList;
import java.util.Scanner;
class MonThi {
    public String id, name, form;

    public MonThi(String id, String name, String form) {
        this.id = id;
        this.name = name;
        this.form = form;
    }
}
public class J07058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MonThi> mt = new ArrayList<>();
        for(int i = 0; i < t; i++){
            MonThi x = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mt.add(x);
        }
        mt.sort((a,b) -> {
            return a.id.compareTo(b.id);
        });
        for(MonThi x : mt){
            System.out.println(x.id + " " + x.name + " " + x.form);
        }
    }
}
