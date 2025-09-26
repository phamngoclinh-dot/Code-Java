import java.util.*;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
            }
            Map<Integer, Integer> h = new LinkedHashMap<>();
            for(int j = 0; j < n; j++){
                // getOrDefault(): nếu a[i] chưa có thì cập nhập value = 1, nếu có rồi thì tăng thêm 1
                h.put(a[j], h.getOrDefault(a[j], 0) + 1);
            }
            System.out.println("Test " + i + ":");
            for(Map.Entry<Integer, Integer> ety : h.entrySet()){
                System.out.println(ety.getKey() + " xuat hien " + ety.getValue() + " lan");
            }
        }
    }
}
