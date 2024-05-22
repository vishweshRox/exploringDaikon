public class IntDivOp {
    public IntDivOp() {
    }

    public static int div(int x, int y) throws Exception {
        if (y == 0) throw new Exception();
        //int result = x / y;
        int x_pos = 1, y_pos = 1;
        if (x < 0) { x = -x; x_pos = 0;}
        if (y < 0) { y = -y; y_pos = 0;}
        int result = 0, rem = x;
        while(rem >= y) {
                rem -= y;
                result++;
            }
        if (x_pos + y_pos == 1) {result = -result;}
        return result;
    }
}
