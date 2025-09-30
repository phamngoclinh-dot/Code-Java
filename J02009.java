import java.util.*;

public class J02009 {
    static class Customer {
        long t, d;
        Customer(long t, long d) {
            this.t = t;
            this.d = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Customer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long t = sc.nextLong();
            long d = sc.nextLong();
            list.add(new Customer(t, d));
        }
        list.sort(Comparator.comparingLong(c -> c.t));

        long finish = 0;
        for (Customer c : list) {
            if (c.t > finish) {
                finish = c.t + c.d;
            } else {
                finish = finish + c.d;
            }
        }

        System.out.println(finish);
    }
}
