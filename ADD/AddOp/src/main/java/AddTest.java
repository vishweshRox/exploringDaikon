import java.util.*;
public class AddTest {

    public static void Test0() throws Exception {
        AddOp tester = new AddOp();
        int x = 0, y = 0;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test1() throws Exception {
        AddOp tester = new AddOp();
        int x = 0, y = 1;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test2() throws Exception {
        AddOp tester = new AddOp();
        int x = 1, y = 0;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test3() throws Exception {
        AddOp tester = new AddOp();
        int x = 1, y = 1;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test4() throws Exception {
        AddOp tester = new AddOp();
        int x = 0, y = -1;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test5() throws Exception {
        AddOp tester = new AddOp();
        int x = -1, y = 0;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test6() throws Exception {
        AddOp tester = new AddOp();
        int x = -1, y = -1;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test7() throws Exception {
        AddOp tester = new AddOp();
        int x = 1, y = -1;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test8() throws Exception {
        AddOp tester = new AddOp();
        int x = -1, y = 1;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test9() throws Exception {
        AddOp tester = new AddOp();
        Random rg = new Random();
        int x = rg.nextInt(1000) - 500, y = rg.nextInt(1000) - 500;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }

    public static void Test10() throws Exception {
        AddOp tester = new AddOp();
        Random rg = new Random();
        int x = rg.nextInt(10000) - 5000, y = rg.nextInt(10000) - 5000;
        if(tester.add(x, y) != x + y) throw new Exception("Test Failure");
    }
    public static void main(String[] args) throws Exception {

        for(int k = 0; k < 100; k++){
            Test10();
        }
    }
}
