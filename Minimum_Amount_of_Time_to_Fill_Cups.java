public class Minimum_Amount_of_Time_to_Fill_Cups {
    public int fillCups(int[] amount) {
        int mcup = 0;
        int sum = 0;
        for (int ccup : amount) {
            mcup = Math.max(ccup, mcup);
            sum += ccup;
        }
        return Math.max(mcup, (sum + 1) / 2);
    }
}
