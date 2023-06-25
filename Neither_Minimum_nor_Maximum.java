import java.util.Arrays;

public class Neither_Minimum_nor_Maximum {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        return nums.length <= 2 ? -1 : nums[1];
    }
}
