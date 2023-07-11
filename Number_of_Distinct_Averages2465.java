import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Number_of_Distinct_Averages2465 {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> st = new TreeSet<>();
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            double avg = (double) (nums[i] + nums[j]) / 2;
            st.add(avg);
        }
        return st.size();
    }
}
