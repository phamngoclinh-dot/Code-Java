import java.lang.reflect.Array;
import java.util.*;
class cat{
    private String ten;
    public cat(String s){
        this.ten  = s;
    }
    public String get(){
        return this.ten;
    }
}
public class PTBN {
    public static void main(String[] args) {
        long a[] = new long[21];
        ArrayList ds = new ArrayList();
        cat meo = new cat("meo");
        System.out.println(meo.get());
    }
}
