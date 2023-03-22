import java.util.*;
class Single_Number {
    public int singleNumber(int[] nums) {
        // int result = 0;
        // for (int number: nums) {
        // result ^= number; // Logical XOR operator
        // }
        // return result;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            if (!set.add(n))
                set.remove(n);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}