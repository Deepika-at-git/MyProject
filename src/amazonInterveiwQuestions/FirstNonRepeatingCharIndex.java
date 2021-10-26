package amazonInterveiwQuestions;

import java.util.HashMap;

public class FirstNonRepeatingCharIndex {

    public static int getNonRepCharIndex(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int getNonRepCharIndexNew(String s) {

        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "leetlcode";
        int index = getNonRepCharIndexNew(s);
        System.out.println(index);
    }

}
