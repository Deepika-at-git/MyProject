package amazonInterveiwQuestions;

import java.util.HashMap;

public class Anagram {

    static class Solution {

        public static void getAnagram(String newstr1, String newstr2) {

            HashMap<Character, Integer> map = new HashMap<>();

            String str1 = newstr1.toLowerCase();
            String str2 = newstr2.toLowerCase();

            for (int i = 0; i < str1.length(); i++) {
                char key = str1.charAt(i);
                if (map.containsKey(key)) {
                    int val = map.get(key);
                    map.put(key, val + 1);
                } else {
                    map.put(key, 1);
                }
            }
            for (int i = 0; i < str2.length(); i++) {
                char key = str2.charAt(i);

                if (map.containsKey(key)) {
                    if (map.get(key) == 1) {
                        map.remove(key);
                    } else {
                        map.put(key, map.get(key) - 1);
                    }
                }
            }

            if (map.size() > 0) {
                System.out.println("Not anagram");
            } else {
                System.out.println("anagram");
            }
        }


        public static void main(String[] args) {

            String str1 = "Anagram";
            String str2 = "Nagaram";
            getAnagram(str1, str2);


        }
    }


}
