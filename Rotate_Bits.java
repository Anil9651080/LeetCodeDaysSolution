import java.util.ArrayList;

public class Rotate_Bits {
    ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> list = new ArrayList<>();
        if (D > 16) {
            D %= 16;
        }
        int a = ((N << D) | (N >> (16 - D))) & (int) Math.pow(2, 16) - 1;
        int b = ((N >> D) | (N << (16 - D))) & (int) Math.pow(2, 16) - 1;

        list.add(a);
        list.add(b);
        return list;
    }
}
