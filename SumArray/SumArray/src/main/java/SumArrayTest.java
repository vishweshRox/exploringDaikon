import java.util.Random;

public class SumArrayTest {

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] randomArray = new int[random.nextInt(10000)];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10000);
        }
        return randomArray;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void Test0() throws Exception {
        SumArrayOp tester = new SumArrayOp();
        int[] t_arr = {};
        if(tester.sum(t_arr) != 0) throw new Exception();
    }
    public static void Test1() throws Exception {
        SumArrayOp tester = new SumArrayOp();
        int[] t_arr = generateRandomArray();
        if(tester.sum(t_arr) != sumArray(t_arr)) throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        Test0();
        for(int i = 0; i < 10000; i++){
            Test1();
        }
    }
}
