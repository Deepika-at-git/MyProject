package InterviewQuestions.java.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {

    public static void main(String[] args) {

        System.out.println("Apples has duplicate characters: " + hasDuplicate("Apples"));
        System.out.println("Fall has duplicate characters: " + hasDuplicate("Fall"));
        System.out.println("Sky has duplicate characters: " + hasDuplicate("Sky"));
        System.out.println("Blocks has duplicate characters: " + hasDuplicate("Blocks"));
    }

    public static char hasDuplicate(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, val + 1);
            } else
                map.put(c, 1);

        }

        int max = 1;
        char m = 0;

        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            char c = i.getKey();
            if (max < i.getValue()) {
                m = c;
                max = i.getValue();
            }
        }

        return m;
    }

}
