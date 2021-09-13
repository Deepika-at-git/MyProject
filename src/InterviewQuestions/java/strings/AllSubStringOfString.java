package InterviewQuestions.java.strings;

public class AllSubStringOfString {

    public static void main(String[] args) {

        String s = "Apple";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = "";
                str = s.substring(i, j);
                System.out.print(str + " ");
            }

        }
    }

}
