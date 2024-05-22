import static java.lang.Math.floor;

public class ExpOp {
    public ExpOp() {}

    public static int exp(int base, int exp) {
        int b = base, e = exp, r = 1;

        while(e > 0) {
            if(e % 2 > 0) {
                r = r * b;
            }
            b *= b;
            e = (int) floor(e/2);
        }
        return r;
    }
}
