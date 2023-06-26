public class Number_of_Unequal_Triplets_in_Array {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
