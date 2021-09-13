package InterviewQuestions.java.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepCharLHM {

    public static void main(String[] args) {
        System.out.println("Apples first non repeated char is: " + firstNonRepCharLHM("madam"));
    }

    public static char firstNonRepCharLHM(String s) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, val + 1);
            } else
                map.put(c, 1);
        }
        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            if (i.getValue() == 1) {
                return i.getKey();
            }
        }

        return 0;
    }

}
