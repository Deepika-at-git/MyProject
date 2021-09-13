package InterviewQuestions.java.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharStringUsingSet {

    public static void main(String[] args) {
        System.out.println("Using hashset to find if the string has all unique characters");
        System.out.println("Apples has all unique characters :" + hasAllUniqueChars("Apple"));
        System.out.println("World has all unique characters :" + hasAllUniqueChars("World"));

    }

    public static boolean hasAllUniqueChars(String s) {

        Set<Character> setUnique = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {

            if (!setUnique.add(s.charAt(i))) {
                return false;
            }

        }

        return true;

    }

}
