public class AddOp {

    public AddOp(){

    }
    public static int add(int x, int y) {
        //int result = x + y;
        int result = 0;
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result = result + 1;
            }
        } else {
            for (int i = 0; i > x; i--) {
                result = result - 1;
            }
        }

        if (y >= 0) {
            for (int i = 0; i < y; i++) {
                result = result + 1;
            }
        } else {
            for (int i = 0; i > y; i--) {
                result = result - 1;
            }
        }
        return result;
    }
}
