import java.util.HashMap;

class Count_Common_Words_With_One_Occurrence_2085 {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> mp1 = new HashMap<>();
        HashMap<String, Integer> mp2 = new HashMap<>();

        for (String w : words1) {
            mp1.put(w, mp1.getOrDefault(w, 0) + 1);
        }
        for (String w : words2) {
            mp2.put(w, mp2.getOrDefault(w, 0) + 1);
        }

        int count = 0;
        for (String word : words1) {
            if (mp1.get(word) == 1 && mp2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }
        return count;
    }
}