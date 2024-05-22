import java.util.Random;

public class RemTest {

    public static void Test0() throws Exception {
        RemOp tester = new RemOp();
        Random rg = new Random();
        int x = rg.nextInt(10000) + 10000, y = rg.nextInt(10000) + 10000;
        int[] result = tester.rem(x, y);
        if(result[0] != x / y || result[1] != x % y) throw new Exception("Test Failure");
    }
    public static void Test1() throws Exception {
        RemOp tester = new RemOp();
        int x = 1, y = 1;
        int[] result = tester.rem(x, y);
        if(result[0] != x / y || result[1] != x % y) throw new Exception("Test Failure");
    }

    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 100; i++) Test0();
        Test1();
    }


}
