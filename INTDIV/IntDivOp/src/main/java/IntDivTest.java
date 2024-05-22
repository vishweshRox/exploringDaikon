import java.util.Random;

public class IntDivTest {
    public static void Test0() throws Exception {
        IntDivOp tester = new IntDivOp();
        Random rg = new Random();
        int r = rg.nextInt(10000) - 5000;
        int x = r, y = r;
        try {
            if(tester.div(x, y) != 1) throw new Exception("Test Failure");
        } catch (Exception e) {
            if (y != 0) throw new Exception("Test Failure");
        }
    }

    public static void Test1() throws Exception {
        IntDivOp tester = new IntDivOp();
        Random rg = new Random();
        int x = rg.nextInt(10000) - 5000, y = 1;
        if(tester.div(x, y) != x) throw new Exception("Test Failure");
    }

    public static void Test2() throws Exception {
        IntDivOp tester = new IntDivOp();
        int x = 1, y = 1;
        if(tester.div(x, y) != 1) throw new Exception("Test Failure");
    }
    public static void Test10() throws Exception {
        IntDivOp tester = new IntDivOp();
        Random rg = new Random();
        int x = rg.nextInt(10000) - 5000, y = rg.nextInt(10000) - 5000;
        try {
            if(tester.div(x, y) != x / y) throw new Exception("Test Failure");
        } catch (Exception e) {
            if (y != 0) throw new Exception("Test Failure");
        }
    }
    public static void main(String[] args) throws Exception {
        Test0();
        Test1();
        Test2();
        for(int k = 0; k < 100; k++){
            Test10();
        }
    }
}
