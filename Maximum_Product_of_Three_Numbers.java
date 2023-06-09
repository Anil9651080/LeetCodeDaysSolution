import java.util.Arrays;

class Maximum_Product_of_Three_Numbers {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if (n >= 3) {
            Arrays.sort(nums);
            return Math.max((nums[0] * nums[1] * nums[n - 1]), (nums[n - 1] * nums[n - 2] * nums[n - 3]));
        }
        return 0;
    }
}