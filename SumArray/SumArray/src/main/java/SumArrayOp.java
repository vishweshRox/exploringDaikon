public class SumArrayOp {
    public SumArrayOp() {}

    public static int sum(int[] arr) {
        int i = 0;
        int sum = 0;
        while(i != arr.length) {
            sum = sum + arr[i];
            i = i + 1;
        }
        return sum;
    }
}
