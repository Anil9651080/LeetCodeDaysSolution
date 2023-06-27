public class Bit_Difference {
    public static int countBitsFlip(int a, int b) {

        int count = 0;
        int result = a ^ b;
        while (result != 0) {
            count++;
            result = result & (result - 1);
        }
        return count;

    }
}
