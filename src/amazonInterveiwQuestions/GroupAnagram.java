package amazonInterveiwQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static List<List<String>> getGroupAnagram(String[] str) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String firstStr = str[i];
            char[] c = firstStr.toCharArray();
            Arrays.sort(c);
            String newStr = new String(c);

            map.putIfAbsent(newStr, new ArrayList<>());
            map.get(newStr).add(firstStr);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] str = {"rat", "tac", "tar", "cat", "bat", "act", "abt", "art", "tab"};
        List<List<String>> result = getGroupAnagram(str);
        System.out.println(result);

    }

}
