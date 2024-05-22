import java.util.Random;

public class MultTest {
    public static void Test0() throws Exception {
        MultOp tester = new MultOp();
        Random rg = new Random();
        int x = rg.nextInt(10000) - 5000, y = rg.nextInt(10000) - 5000;
        if(tester.mult(x, y) != x * y) throw new Exception("Test Failure");
    }

    public static void Test1() throws Exception {
        MultOp tester = new MultOp();
        Random rg = new Random();
        int x = rg.nextInt(10000) - 5000, y = 1;
        if(tester.mult(x, y) != x * y) throw new Exception("Test Failure");
    }
    public static void Test2() throws Exception {
        MultOp tester = new MultOp();
        Random rg = new Random();
        int y = rg.nextInt(10000) - 5000, x = 1;
        if(tester.mult(x, y) != x * y) throw new Exception("Test Failure");
    }
    public static void Test3() throws Exception {
        MultOp tester = new MultOp();
        Random rg = new Random();
        int x = rg.nextInt(10000) - 5000, y = 0;
        if(tester.mult(x, y) != x * y) throw new Exception("Test Failure");
    }
    public static void Test4() throws Exception {
        MultOp tester = new MultOp();
        Random rg = new Random();
        int y = rg.nextInt(10000) - 5000, x = 0;
        if(tester.mult(x, y) != x * y) throw new Exception("Test Failure");
    }
    public static void main(String[] args) throws Exception {

        for(int k = 0; k < 10000; k++){
            Test0();
        }
        Test1();
        Test2();
    }
}
