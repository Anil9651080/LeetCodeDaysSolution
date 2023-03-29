class Take_Gifts_From_the_Richest_Pile {
    public long pickGifts(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int max = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] > nums[max])
                    max = j;
            }
            nums[max] = (int) Math.floor(Math.sqrt(nums[max]));
        }
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}