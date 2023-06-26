public class Number_of_Senior_Citizens {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int mid = Integer.parseInt(details[i].substring(11, 13));
            if (mid > 60) {
                count++;
            }
        }
        return count;
    }
}
