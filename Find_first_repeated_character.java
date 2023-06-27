import java.util.HashSet;

public class Find_first_repeated_character {
    String firstRepChar(String s) {

        HashSet<Character> cset = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!cset.add(s.charAt(i))) {
                return "" + s.charAt(i);

            }
        }
        return "-1";
    }
}
