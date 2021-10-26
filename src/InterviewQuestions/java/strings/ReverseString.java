package InterviewQuestions.java.strings;


public class ReverseString {

    private static String reverse(String s) {
        // implement your code
        String rev = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }


    private static String reverse3(String s) {
        // implement your code
        char[] rev = new char[s.length()];
        int j = 0;
        for (int i = (s.length() - 1); i >= 0; i--) {
            rev[j++] = s.charAt(i);
        }

        return new String(rev);
    }


    public static void main(String[] args) {


        String str = "STUDENT";
        String rev = reverse3(str);
        System.out.println("Reversed string is " + rev);

    }

}
