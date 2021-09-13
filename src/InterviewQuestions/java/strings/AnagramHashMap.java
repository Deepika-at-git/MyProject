package InterviewQuestions.java.strings;

import java.util.HashMap;

public class AnagramHashMap {

    public boolean anagramString(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);

            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                if (map.get(str2.charAt(i)) == 1) {
                    map.remove(str2.charAt(i));
                } else
                    map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            } else
                return false;


        }
        return map.isEmpty();
    }

    public static void main(String[] args) {

        AnagramHashMap as = new AnagramHashMap();
        String s1 = "aaabb";
        String s2 = "bbaaaa";
        boolean result = as.anagramString(s1, s2);
        System.out.println("s1 and s2 is anagram:" + result);
    }

}
