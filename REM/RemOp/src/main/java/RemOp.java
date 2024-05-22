import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class RemOp {
    public RemOp() {}

    public static int[] rem (int x, int y) throws Exception {
        //return x % y;
        int r =  x;
        int m = abs(y);
        int q = 0;
        while(r >= m) {
            q = q + 1;
            r = r - m;
            //Attempt at forcing the invariant
            if(r + q * m != x) throw new Exception();
        }
        if (y < 0) {q = -q;}
        return new int[]{q, r};
    }
}
