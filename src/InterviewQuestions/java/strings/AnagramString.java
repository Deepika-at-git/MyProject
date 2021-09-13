package InterviewQuestions.java.strings;

public class AnagramString {

    public boolean stringAnagram(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            int index = str2.indexOf(c);

            if (index != -1) {
                str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
            } else
                return false;
        }

        return str2.isEmpty();

    }

    public static void main(String[] args) {

        AnagramString as = new AnagramString();
        String s1 = "Madam";
        String s2 = "Adam";
        boolean result = as.stringAnagram(s1, s2);
        System.out.println("Str1 and str2 is anagram: " + result);
    }

}
