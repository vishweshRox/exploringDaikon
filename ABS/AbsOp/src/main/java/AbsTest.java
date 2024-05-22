import java.util.Random;

public class AbsTest {

    public static void Test0() throws Exception {
        AbsOp tester = new AbsOp();
        Random rg = new Random();
        int r = rg.nextInt(10000) - 5000;
        int abs = r >= 0 ? r : -r;
        int x = r;
        if(tester.abs(x) != abs) throw new Exception("Test Failure");
    }

    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 100; i++){
            Test0();
        }
    }

}
