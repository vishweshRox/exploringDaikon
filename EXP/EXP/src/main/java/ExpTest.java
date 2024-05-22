import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class ExpTest {
    public static void Test0() throws Exception {
        ExpOp tester = new ExpOp();
        Random r = new Random();
        int b = abs(r.nextInt(10)), e = abs(r.nextInt(10));
        if(tester.exp(b, e) != pow(b, e)) throw new Exception("TEST FAILED");
    }

    public static void Test1() throws Exception {
        ExpOp tester = new ExpOp();
        Random r = new Random();
        int b = abs(r.nextInt(10000)), e = 0;
        if(tester.exp(b, e) != 1) throw new Exception("TEST FAILED");
    }

    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 10000; i++) Test0();
        Test1();
    }
}
