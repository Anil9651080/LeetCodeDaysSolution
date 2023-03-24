class Count_the_Number_of_Vowel_Strings_in_Range {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            char c = words[i].charAt(0);
            char d = words[i].charAt(words[i].length() - 1);
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    && (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')) {
                count++;
            }
        }
        return count;
    }
}