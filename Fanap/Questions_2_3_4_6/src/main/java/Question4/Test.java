package Question4;
import java.util.*;
public class Test {
    static class A {
        int id = 0;
        public A(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(2);
        A a3 = new A(1);

        Map<A, String> mp = new HashMap<A, String>();
        mp.put(a1, "hassan");
        mp.put(a2, "karim");
        mp.put(a3, "ali");
        //a1 should be changed to a3...
        System.out.println(mp.get(a3));
    }
}
