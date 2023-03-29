import java.util.ArrayList;
import java.util.List;

class Merge_Two_2D_Arrays_by_Summing_Values {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        List<int[]> res = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length || j < nums2.length;) {
            if (i >= nums1.length) {
                res.add(nums2[j++]);
                continue;
            }
            if (j >= nums2.length) {
                res.add(nums1[i++]);
                continue;
            }
            if (nums1[i][0] == nums2[j][0]) {
                res.add(new int[] { nums1[i][0], nums1[i++][1] + nums2[j++][1] });
            } else if (nums1[i][0] < nums2[j][0]) {
                res.add(nums1[i++]);
            } else {
                res.add(nums2[j++]);
            }
        }
        return res.toArray(int[][]::new);
    }
}