public class Semi_Ordered_Permutation {
    public int semiOrderedPermutation(int[] nums) {
        int first = 0, last = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                first = i;
            }
            if (nums[i] == n) {
                last = i;
            }
        }
        int min = 0;
        if (first < last)
            min = (first + (n - last - 1));
        else
            min = (first + (n - last - 2));
        return min;
    }
}
