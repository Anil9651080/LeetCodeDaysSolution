public class Maximum_Value_of_a_String_in_an_Array {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for (String s : strs) {
            ans = Math.max(ans, GetValue(s));
        }
        return ans;
    }

    private int GetValue(String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                return s.length();
            }
        }
        return Integer.parseInt(s);
    }

}
