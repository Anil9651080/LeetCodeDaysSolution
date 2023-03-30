import java.util.*;

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public int differenceOfSum(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        int sum = 0;
        int ansum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int x = nums[i];
            while (x > 0) {
                int rem = x % 10;
                ar.add(rem);
                x /= 10;

            }
        }
        Collections.reverse(ar);
        int ans[] = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++) {
            ans[i] = ar.get(i);
            ansum += ans[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum - ansum;
    }
}
