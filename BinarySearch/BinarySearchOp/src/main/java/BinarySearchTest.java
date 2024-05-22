import java.util.Random;
import java.util.Arrays;

import static java.lang.Math.abs;

public class BinarySearchTest {

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] randomArray = new int[abs(random.nextInt(10000)) + 1];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10000);
        }
        return randomArray;
    }

    public static int[] insertAndSort() {
        Random random = new Random();
        int[] t = generateRandomArray();
        int[] e = new int[t.length + 1];
        int r_i = abs(random.nextInt(t.length));
        for (int i = 0; i < e.length; i++) {
            if (i < r_i) e[i] = t[i];
            if (i == r_i) e[i] = 5894;
            if (i > r_i) e[i] = t[i-1];
        }
        Arrays.sort(e);
        return e;
    }

    public static int findIndex(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static void Test0() throws Exception {
        BinarySearchOp tester = new BinarySearchOp();
        int[] test_arr = {};
        if(tester.search(test_arr, 7) != -1) throw new Exception();
    }
    public static void Test1() throws Exception {
        BinarySearchOp tester = new BinarySearchOp();
        int[] test_arr = {1, 3, 9};
        if(tester.search(test_arr, 7) != -1) throw new Exception();
    }

    public static void Test2() throws Exception {
        int[] test_arr = insertAndSort();
        BinarySearchOp tester = new BinarySearchOp();
        int idx = tester.search(test_arr, 5894);
        boolean verdict = idx != -1 ? test_arr[idx] == 5894 : idx == findIndex(test_arr, 5894);
        if (!verdict) throw new Exception("TEST FAILED");
    }
    public static void main(String[] args) throws Exception {
        Test0();
        Test1();
        for(int i = 0; i < 10000; i++){
            Test2();
        }

        System.out.println("ALL TESTS PASS SUCCESSFULLY");

    }
}
