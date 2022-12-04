import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Integer[] a = {0,1,2,3,4};
        Integer[] b = {1,2,3,2,4};
        System.out.println(F(a,b));
    }

    public static List F(Integer[] a, Integer[] b){
        if (a.length != b.length) throw new RuntimeException("Длины массивов не равны");
        if (a == null && b == null) throw new RuntimeException("Массивы пусты");

        var c = new ArrayList<Integer>();
        for (int i=0;i<a.length;i++){
            if (b[i] == 0){
                throw new RuntimeException("На ноль делить нельзя!");
            }
            c.add(a[i]/b[i]);
        }
        return c;
    }
}
