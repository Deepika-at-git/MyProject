package InterviewQuestions.java.strings;

import java.util.HashMap;

public class FirstNonRepChar {

    public static void main(String[] args) {
        //System.out.println("First non repeated char in Apple is: " + nonRepCharInString("Apple"));
        System.out.println("First non repeated char in Apple is: " + nonRepCharInString("character"));
    }

    public static char nonRepCharInString(String s) {
        HashMap<Character, Integer> mapChar = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (mapChar.containsKey(c)) {
                int count = mapChar.get(c);
                mapChar.put(c, count + 1);
            } else
                mapChar.put(c, 1);
        }
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {

            char rep = s.charAt(i);
            int val = mapChar.get(rep);
            if (val == 1) {
                // to get the second non repeated char
                temp++;
                if (temp == 2)
                    return rep;
            }
        }

        return 0;
    }

}
