public class Power_of_2 {
    public static boolean isPowerofTwo(long n) {

        long pow = 1;
        while (pow <= n) {
            if (pow == n) {
                return true;
            }
            pow *= 2;
        }
        return false;

    }
}
