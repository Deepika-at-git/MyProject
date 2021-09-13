package InterviewQuestions.java.strings;

public class UniqueCharStringUsingIndexOf {

    public static void main(String[] args) {

        System.out.println("Apple has all unique chars :" + uniqueCharInString("Apples"));
        System.out.println("Water has all unique chars :" + uniqueCharInString("Water"));
        System.out.println("Rain has all unique chars :" + uniqueCharInString("Rain"));
        System.out.println("Boolean has all unique chars :" + uniqueCharInString("Boolean"));

    }

    public static boolean uniqueCharInString(String s) {

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (s.indexOf(c) != s.lastIndexOf(c)) {
                return false;
            }

        }

        return true;
    }

}
